import java.util.*;
public class Atm {
    // select language 
    public static String selectLanguage(Scanner sc) {
        // StringBuilder str = new StringBuilder("");
        System.out.println("Select Language from 1 to 2");
        System.out.println("1. English");
        System.out.println("2.Hindi ");
        int i = sc.nextInt();

        switch (i) {
            case 1:
                System.out.println("You selected English");
                return "English";
                
            
            case 2 : 
                System.out.println("You Selcted Hindi ");
                return "Hindi";

            default:
                System.out.println("Transactin time Out");
                return "Time out";
        }

    }

    public static String selectAccount(Scanner sc) { 
        System.out.println();
        System.out.println("Select Account  type");
        System.out.println("1. Savings Account");
        System.out.println("2.Current Account");
        System.out.println("Enter Option");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                return "Savings";
                
            case 2 : 
                return "Current";

            default:
                return " Time Out ";
        }
    }

    public static String task(Scanner sc ) {
        System.out.println("Select task");
        System.out.println("1. Change Pin");
        System.out.println("2. Withdrawl");
        System.out.println("3.CheckBalance");
        System.out.println();
        System.out.println("Select account type");
        int i = sc.nextInt();
        switch (i) {
            case 1:
                return "ChangePin";
            case 2:
                return "Withdrawl";
            case 3:
                return "Checkbalance";
            default:
                return "Time Out";
        }
    }

    // checkBalance  
    public static void checkBalance(Scanner sc) {
        System.out.println("Enter your 4 digit Pin : ");
        int i = sc.nextInt();
        if(i == 1234) {
            System.out.println("Current Balance is " +  2000);
        }
        else {
            System.out.println("Wrong Transaction pin ");
            System.out.println("Declined !!! Transaction");
        }
        return;
    }

    // Change Pin
    public static void changePin(Scanner sc) {
        System.out.println("Enter account Number");
        String acNo = sc.next();
        System.out.println("Enter Mobile Number  : ");
        String mobNo = sc.next();
        if(acNo.equals("1234") && mobNo.equals("1234")) {
            System.out.println("Otp Sent");
            System.out.println("Enter Otp");
            int i = sc.nextInt();
            System.out.println("Enter new PIN : ");
            String pin = sc.next();
            System.out.println("Pin Changed successfully");
        }
        else {
            System.out.println("Wrong Credentials ");
            return;
        }

    }
    // withdrawl
    public static void withdrawl(Scanner sc) {
        System.out.println("Enter Pin");
        int i = sc.nextInt();
        if(i == 1234) {
            System.out.println("Enter amount  : ");
            String str = sc.next();
            System.out.println("Please collect your Cash before");
        }
        else {
            System.out.println("Wrong PIN ");
            System.out.println("Transaction Declined : ");
            return;
        }
    }
        // Quick

    public static void QuickTransaction(Scanner sc) {
        
        System.out.println("User id");
        String Userid = sc.nextLine();
        System.out.println();
        System.out.println("Enter amount");
        String s = sc.next();
        System.out.println("Enter OTP");
        String otp = sc.next();
        if(Userid.equals("1234") && otp.equals("1234")) {
            System.out.println("Please collect your cash");
            return;
        }
        else {
            System.out.println("Wrong OTP !!!!"); 
        }
    }
    // deposit
    public static void cardlessDepost(Scanner sc) {
        System.out.println("Enter account number");
        String ac = sc.next();
        System.out.println("Reconfirm your account number ");
        String ac2 = sc.next();
        if(ac.equals(ac2)) {
            for(int i = 0; i  < 3 ; i++) {
               
            }
            System.out.println("Collected cash XXXX");
            System.out.println("Confirm if correct");
            boolean cnf = sc.nextBoolean();
            if(cnf) System.out.println("Deposited !!");
            else System.out.println("Declined !!!");
        }
    }
     public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intsert Card by writing true or false");
        boolean insertedCard = sc.nextBoolean();
        if(insertedCard) {
            // with card transaction 
            String language = selectLanguage(sc); //  language
            System.out.println();
            System.out.println("Language Selected " + language);
            System.out.println();
            String selectAccount = selectAccount(sc); // selectAccount type
            System.out.println();
            System.out.println("Selected Account " + selectAccount);
            System.out.println();

            String task = task(sc); //  task
            System.out.println();
            System.out.println("Task");
            // task management
            switch (task) {
                case "ChangePin":
                    changePin(sc);
                    break;
            
                case "Withdrawl":
                    withdrawl(sc);
                    insertedCard = false;
                    break;

                case "Checkbalance":
                    checkBalance(sc);
                    break;
                default:
                    System.out.println("Time out");
                    break;
            }

        } 
        else{
            // cardless transaction
            String task = cardlessTask(sc);
            switch (task) {
                case "Deposit":
                    cardlessDepost(sc);
                    break;
            
                case "Quick Withdrawl":
                    QuickTransaction(sc);
                    break;
            
                default:
                    break;
            }

        }
        System.out.println("Thanku for banking with us");
    }

    public static String cardlessTask(Scanner sc) {
        System.out.println("Select transaction  :" );
        System.out.println("1.Deposit ");
        System.out.println("2.Quick Withdrawl");
        System.out.println("Enter Task : ");
        int s = sc.nextInt();
        switch (s) {
            case 1:
                return "Deposit";
                
            case 2:
                return "Quick Withdrawl";
            default:
                return "Time Out";
        }

    }
}
