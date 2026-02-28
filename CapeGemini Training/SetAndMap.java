import java.util.*;

public class SetAndMap {
    public static void writeMenu() {
        System.out.println("-----------TASK-----------");
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Find Mobile with Name");
        System.out.println("4.Size");
    }


    ArrayList<Products> Ecommerce = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        while(true) {
            // write menu
            writeMenu();
            System.out.println("Selct menu : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ADD Mobile ");
                    System.out.println("ADD BRAND");
                    String str = sc.next();

                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            
                default:
                    break;
            }
        }
    }
        
}

class Products {
    HashMap<String, ArrayList<HashSet<String>>> productMap = new HashMap<>();
    
}