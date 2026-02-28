import java.util.*;
public class DiceGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean yes = true;
        int max = 6;
        int min = 1;
        while(yes) {
            System.out.println("Its Your Turn click enter");
            String s = sc.next();
            try{
                System.out.print("(");
                System.out.flush();
                Thread.sleep(50);
                
                System.out.print(" )");
                Thread.sleep(50);
                System.out.print("(");
                Thread.sleep(50);
                System.out.print(" )");
                Thread.sleep(50);
                System.out.print("(");
                Thread.sleep(50);
                System.out.print(" )");
                Thread.sleep(50);
                System.out.print("(");
                Thread.sleep(50);
                System.out.print(" )");
                Thread.sleep(50);
                System.out.print("(");
                Thread.sleep(50);
                System.out.print(" )");
                Thread.sleep(50);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
              System.out.println();
            int n = (int)(Math.random() * ((max - min) + 1) + min);

            System.out.println("Your number is : " + n);
            
            System.out.println("CPU Turn");

            try{
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print("-");
                Thread.sleep(200);
                System.out.print(">");
                Thread.sleep(200);
            }
            catch(Exception ey) {
                ey.printStackTrace();
            }
            int cpu = (int)(Math.random() * ((max - min) + 1) + min);
            System.out.println("Cpu Won");
            if(cpu < n) {
                System.out.println("You Won :) !!!!!!!!!!!!!");
            }
            else {
                System.out.println("CPU WON  :(");
            }
           System.out.println("Do You want to play again type true");
           yes = sc.nextBoolean();
        }
    }
}
