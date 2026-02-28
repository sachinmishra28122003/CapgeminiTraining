import java.util.*;

public class LogisticsManagementSystem {
    ArrayList<User> u = new ArrayList<>();
    ArrayList<Products> p = new ArrayList<>();
    ArrayList<Order> o = new ArrayList<>();
    String status ="";
    public static void printMenu() {
        System.out.println("-------MAIN-MENU--------");
        System.out.println("1.Register Users : ");
        System.out.println("2.Add New Products : ");
        System.out.println("3.Login TO BUY");
    }

    // Adding new Users
    public void register(String name, String add) {
        u.add(new User(u.size(), name, add));
        System.out.println("                     ID GENERATED : " + (u.size() - 1));
    }

    // Adding Products 
    public void products(String name, String add) {
        p.add(new Products(p.size(), name, add));
        System.out.println("Products is added with id : " + (p.size() - 1));
    }

    // purchasing
    public void login(int id, Scanner sc) {
        if(id > u.size()) {
            System.out.println("InVALID ID !!!");
            return;
        }
        showProducts();
        int i = sc.nextInt() ;
        if(i > p.size()) {
            System.out.println("Enter valid id");
            return;
        }
        AddOrders(p.get(i), u.get(id));
        update();
        
    }
    // show Products 
    public void showProducts() {
        System.out.println("ID " + "PRODUCT NAME");
        for(Products p : p) {
            System.out.println(p.id + "  " + p.name);
        }
    }

    // show Orders 
    public void AddOrders(Products pro, User user) {
        o.add(new Order(o.size(), user, pro));
        System.out.println("Order places with id  : " + (o.size() - 1) +
            " Will be placed to u soon");
        status = "Ordered";
        System.out.println();
        System.out.println("Status " + status);
    }

    // public void update order
    public void update() {
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        System.out.println("     |");
        try{    
            Thread.sleep(300);
            status = "Packed";
            System.out.println("Status : " + status);
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println();
            Thread.sleep(300);
            status = "Shipped";
            System.out.println("Status : " + status);
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println();
            Thread.sleep(300);
            status = "Delivered";
            System.out.println("Status : " + status);
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println("     |");
            System.out.println();

        } catch(Exception e) {
            e.printStackTrace();
        }  
    }
    public static void main(String args[]) {
        LogisticsManagementSystem lms = new LogisticsManagementSystem();
        Scanner sc = new Scanner(System.in);
        boolean task = true;
        while(task) {
            printMenu();
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Enter Name  : ");
                    String name = sc.next();
                    System.out.println("Enter your Address : ");
                    String add = sc.next();
                    lms.register(name, add);
                    break;
                case 2:
                    System.out.println("Enter Name  : ");
                    String name2 = sc.next();
                    System.out.println("Enter your Address : ");
                    String add2 = sc.next();
                    lms.products(name2, add2);
                    break;
                case 3:
                    System.out.println("Enter your USER ID : ");
                    int id = sc.nextInt();
                    lms.login(id, sc);
                    break;
            
                default:
                    System.out.println("Enter your correct option ");
                    break;
            }
        }
        sc.close();
    }
}
class User {
    String name;
    String destination;
    int id;
    User(int id, String name, String destination) {
        this.id = id;
        this.name = name;
        this.destination = destination;
    }
}

class Products {
    String name;
    String source;
    int id ;
    Products(int id, String name, String source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }
}


class Order {
    HashMap<User, Products> order = new HashMap<>();
    int id;
    Order(int id, User u, Products p) {
        this.id = id;
        this.order.put(u,p);
    }
}