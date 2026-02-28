import java.util.*;
public class Read5IntegerAndCalculateSum {
    public static void main(String args[]) {
        try(Scanner sc = new Scanner(System.in);) {
            System.out.print("Enter First Number  : ");
            int a = sc.nextInt();
            System.out.print("Enter Second Number  : ");
            int b = sc.nextInt();
            System.out.print("Enter Third Number  : ");
            int c = sc.nextInt();
            System.out.print("Enter Fourth Number  : ");
            int d = sc.nextInt();
            System.out.print("Enter Fifth Number  : ");
            int e = sc.nextInt();

            System.out.println("Sum : "
                                + (a+b+c+d+e));
        }
        catch (InputMismatchException e) {
            System.out.println("Kindly enter interger till range " +
                    Integer.MIN_VALUE + " to "
                    + Integer.MIN_VALUE);
        }
        catch(NoSuchElementException e)  { //enum
            System.out.println("No More Elements");
        }
        catch (IllegalStateException e) {
            System.out.println("Scanner Class is close : ");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
