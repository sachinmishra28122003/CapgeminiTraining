import java.util.*;

public class Reachable {
    public static int sum(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int sum = 0;
        while(n > 0) {
            int digit = n%10;
            digit *= digit;
            sum += digit;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        int nextNum = sum(n);
        Set<Integer> s = new HashSet<>();
        s.add(n);
        s.add(nextNum);
        while(nextNum != n) {
            nextNum = sum(nextNum);
            count++;
            if(nextNum == n) {
                System.out.println(count);
                break;
            }
            else if(s.contains(nextNum)) {
                System.out.println(-1);
                break;
            }
            s.add(nextNum);
        }
    }
}
