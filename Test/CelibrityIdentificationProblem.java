import java.util.*;
public class CelibrityIdentificationProblem {
    static Stack<Integer> s = new Stack<>();
    public static void pushId(int arr) {
        while(arr >= 0) {
            s.push(arr);
            arr--;
        }
    }
    public static int findCelibrity(int mat[][]) {
        while(s.size() > 1) {
            int a = s.pop();
            int b = s.pop();

            if(mat[a][b] != 0) {
                s.push(b);
            }
            else {
                s.push(a);
            }
        }
        int c = s.peek();
        for(int i = 0; i < mat.length; i++) {
            if(i == c) {
                continue;
            }
            if(mat[c][i] != 0 || mat[i][c] == 0) {
                return -1;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        int[][] mat = {{1,1,0}, { 0,1,0}, {0,1,1}};
        pushId(mat.length - 1);
        System.out.println("Celebrity at index no (ID)  : " + findCelibrity(mat));
    }
}
