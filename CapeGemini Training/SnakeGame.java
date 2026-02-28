import java.util.*;
import java.io.*;

public class SnakeGame {
    // making the field size constant 
    static final int ROWS = 15;
    static final int COLS = 30;

    static char[][] board = new char[ROWS][COLS];
    // for storing the body coordinates
    static Deque<int[]> snake = new ArrayDeque<>();

    static int foodRow, foodCol;
    static char direction = 'd'; // start moving right as default direction 
    static boolean gameOver = false;

    static Random rand = new Random();

    public static void main(String[] args) throws Exception {

        initGame();

        while (!gameOver) {
        if (readInputBlocking()) {
            moveSnake();
            drawBoard();
        }
    }
        clearScreen();
        drawBoard();
        System.out.println("\n GAME OVER!");
    }

    //  INITIALIZE BORD AND SNAKE FROM BEGINNING \ 
    public static void initGame() {
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(board[i], '.');
        }

        // initial snake (length 3)
        int r = ROWS / 2;
        int c = COLS / 2;
        // starting coordinated of snake
        // we are taking default size of snake as 3
        // Entering in queue
        snake.addFirst(new int[]{r, c});
        snake.addLast(new int[]{r, c - 1});
        snake.addLast(new int[]{r, c - 2});

        for (int[] part : snake) {
            board[part[0]][part[1]] = '#';
        }

        placeFood();
    }
    //  INPUT 

    public static boolean readInputBlocking() throws IOException {
        char ch = (char) System.in.read();

        // ignore Enter
        if (ch == '\n' || ch == '\r') {
            return false;
        }

        // prevent reverse direction no two keys should be selected together(like w and s)
        if ((ch == 'w' && direction != 's') ||
            (ch == 's' && direction != 'w') ||
            (ch == 'a' && direction != 'd') ||
            (ch == 'd' && direction != 'a')) {
            direction = ch;
        }

        return true;
    }
    //  GAME LOGIC 

    public static void moveSnake() {
        int[] head = snake.peekFirst();
        int newRow = head[0];
        int newCol = head[1];

        switch (direction) {
            case 'w': newRow--; break;
            case 's': newRow++; break;
            case 'a': newCol--; break;
            case 'd': newCol++; break;
        }

        // boundary collision of field leding to GAME OVER 
        if (newRow < 0 || newRow >= ROWS || newCol < 0 || newCol >= COLS) {
            gameOver = true;
            return;
        }

        // self collision leding to GAME OVER TOO
        // Checking Queue coordinates to check in which coordinates snake body lies
        for (int[] part : snake) {
            if (part[0] == newRow && part[1] == newCol) {
                gameOver = true;
                return;
            }
        }

        // add new head
        snake.addFirst(new int[]{newRow, newCol});

        if (newRow == foodRow && newCol == foodCol) {
            placeFood(); // grow snake
        } else {
            int[] tail = snake.removeLast();
            board[tail[0]][tail[1]] = '.';
        }

        board[newRow][newCol] = '#';
    }

    // Placing food as Money 
    public static void placeFood() {
        while (true) {
            // placing food at random position 
            foodRow = rand.nextInt(ROWS);
            foodCol = rand.nextInt(COLS);
            // checking not to put food where the snake mouth is already
            if (board[foodRow][foodCol] == '.') {
                board[foodRow][foodCol] = '$';
                break;
            }
        }
    }
    // DISPLAY 

    public static void drawBoard() {
        clearScreen();

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nControls: W A S D");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
