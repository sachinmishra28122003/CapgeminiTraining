import java.util.*;
public class LMSSystem {
    ArrayList<Student> college = new ArrayList<>();
    HashMap<String, HashSet<Materials>> h = new HashMap<>();

    public void registration(String name) {
        college.add(new Student(name));
        System.out.println("ID GENERATED  : " +( college.size() - 1));
        System.out.println("Pass word is  : " + name);
    }

    public boolean login(String id, String pass) {
        boolean result = college.get(Integer.parseInt(id)).name.equals(pass)  ?
                        true : false;
        if(result) System.out.println(" Login Success fully !!");
        else {
            System.out.println("Login Failed !!");
        }
        return result;
    }

    public void access(String id , String name) {
        if(!login(id, name)) {
            return;
        }
        if(college.get(Integer.parseInt(id)).accesable.books) {
            System.out.println("You can Access Books");
        }
        
        if(college.get(Integer.parseInt(id)).accesable.pdf) {
            System.out.println("You can Access Pdf");
        }
        
        if(college.get(Integer.parseInt(id)).accesable.test) {
            System.out.println("You can Access Test");
        }
        
        
    }

    public static void performTask() {
        System.out.println("-----------TASKS-----------");
        System.out.println("1.registrations");
        System.out.println("2.Accessable");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LMSSystem lms = new LMSSystem();
        boolean task = true;
        while (task) {
            performTask();
            System.out.println("Enter the task to Perform : ");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Enter name  ");
                    String name = sc.next();
                    lms.registration(name);
                    break;
                case 2:
                    System.out.println("Enter id");
                    String id = sc.next();
                    System.out.println("Enter name");
                    String n = sc.next(); 
                    lms.access(id, n);
                    break;
            
                default:
                    System.out.println("Select correct Task");
                    break;
            }
            System.out.println("Enter if u want to perform more task : ");
            task = sc.nextBoolean();
        }
    }
}

class Student {
    Materials accesable;
    String id;
    String name;
    Student(String name) {
        this.name = name;
        accesable = new Materials();
    }
    void setAccessBooks() {
        accesable.books =  true;
    }
    void setAccessPdf() {
        accesable.pdf =  true;
    }
    void setAccessTest() {
        accesable.test =  true;
    }
}
class Materials {
    boolean books;
    boolean pdf;
    boolean test;
    Materials() {
        this.books = true;
        this.pdf = true;
    }
}