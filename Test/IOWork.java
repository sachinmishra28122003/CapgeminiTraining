import java.util.*;
public class IOWork {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number  : ");
        int roll = sc.nextInt();
        // sc.nextLine();
        System.out.print("Enter your Name : ");
        String name = sc.next() +" "+ sc.next();
        sc.close();
        System.out.println();
        System.out.println("Information : ");
        System.out.println("ROll Number : " + roll) ;
        System.out.println("Name  :  " + name);
    }
}