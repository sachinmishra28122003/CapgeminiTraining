package question2;

import java.util.Scanner;

public class ExceptionHandling {
    public static void  menu() {
        System.out.println("----------- Hash Map -----------");
        System.out.println("1. Enter  username and password");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        HashMapChild map = new HashMapChild();
        int input;
        do {
            menu();
            System.out.print("Kindly enter 1 to Enter details ");
            input = sc.nextInt();
            System.out.println();
            if(input == 1) {
                System.out.println("Enter User Name : ") ;
                String userName = sc.nextLine();
                sc.nextLine();
                System.out.println("Enter your Password : ");
                String pass = sc.nextLine();
                String user = map.put(userName,pass).toString();

            }

            else {
                System.out.println("!! Wrong Menu Selection !!");
            }
        } while (input == 1);
    }
}

