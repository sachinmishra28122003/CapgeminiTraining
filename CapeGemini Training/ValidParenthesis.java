import java.util.*;
public class ValidParenthesis {
    public static void validateParenthesis(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // opening bracket
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // closing bracket
            else if (ch == ')' || ch == ']' || ch == '}') {

                if (stack.isEmpty()) {
                    System.out.println("Fail");
                    return;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    System.out.println("Fail");
                    return;
                }
            }
            else {
                System.out.println("Fail");
                return;
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Validates Successfully");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parenthesis : ");
        String input = sc.next();

        validateParenthesis(input);
        sc.close();
    }
}
