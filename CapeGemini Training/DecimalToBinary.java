import java.util.*;
public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        Stack<Integer> s = new Stack<>();
        String result = "";
        while(n > 0) {
            s.push(n % 2);
            n = n/2;
        }
        while(!s.isEmpty()) {
            result += s.pop().toString();
        }
        System.out.println(result);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the number u want to convert ");
        int n = sc.nextInt();
        decimalToBinary(n);
        sc.close();
    }
}
