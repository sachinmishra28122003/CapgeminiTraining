import java.util.*;
public class Postfix {
    // Reversed Polish notation 
    public static void infixToPostFix(String input) {
        Stack<Character> s = new Stack<>();
        String ans = "";
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if((c <= '9' && c >= '0' ) ||
                (c <= 'z' && c >= 'a') ||
               ( c <= 'Z' && c >= 'A'))
            {
                ans += c;
            }
            else if(c == '(') {
                s.push(c);
            }
            else if (c == '+' || c =='-' 
                || c == '*' || c == '/' 
                || c == '^' || c == '%'
             ) {
                while(s.isEmpty() != true && precedence(c) < precedence(s.peek())) {
                    ans += s.pop();
                }
                s.push(c);
            }
            else if(c == ')') {
                while(s.isEmpty() != true && s.peek() != '(') {
                    ans+= s.pop();
                }
                if(!s.isEmpty())
                    s.pop();
            }
        }
        while(!s.isEmpty()) {
            ans += s.pop();
        }
        System.out.println( "Result: " + ans);
    }
    public static int precedence(char c) {
        if(c == '^')
            return 3;
        else if(c == '*' || c == '/' || c == '%') 
            return 2;
        else if(c == '+' || c == '-') 
            return 1;
        return 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the input Expression");
        String input = sc.nextLine();
        infixToPostFix(input);
        sc.close();
    }
}
