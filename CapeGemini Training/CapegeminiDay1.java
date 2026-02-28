import java.util.*;
public class CapegeminiDay1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter your name  :");
        String name = sc.next();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.println("NAME : " + name +  " AGE : " + age);

        System.out.println("Till 2030 your age will be : " + (age + 5));
    }
}