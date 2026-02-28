import java.util.*;

public class Student {
    ArrayList<Stu> college = new ArrayList<>();
    // void add
    void add(String name) {
        String id = String.valueOf(college.size());
        college.add(new Stu(name, id));
        System.out.println("Welcome to XYZ COllege !!!!");
        System.out.println("Name  : " + name);
        System.out.println("Your Generated id is  : " + id);
    }
    // update 
    void updateName(String name, String id) {
        String n = college.get(Integer.parseInt(id)).name;
        college.get(Integer.parseInt(id)).name = name;
        System.out.println("Name of : " +
            n + 
            " TO  : " + 
            college.get(Integer.parseInt(id)).name
        ); 
    }
    // void delete 
    void delete(String id) {
        System.out.println("Student Deleted : " +
            college.get(Integer.parseInt(id)).name
        );
        college.remove(Integer.parseInt(id));
    }
    // show
    void show() {
        System.out.println("-------------------------STUDENTS----------------------");
        for(Stu s : college) {
            System.out.println("Name : " + 
                s.name + 
                " Enrollement number is  : " +
                s.enrollNo
            );
        }
    }

    public static void menu() {
        System.out.println("Perform task for college");
        System.out.println("1.Add Student ");
        System.out.println("2.DELETE Student");
        System.out.println("3.Update Name ");
        System.out.println("4.Show Student List");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Student Galgotias = new Student();

        boolean task = true;
        while(task) {
            menu();
            System.out.println("Select Task to Perform : ");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Enter Student Name : ");
                    String name = sc.next();
                    Galgotias.add(name);
                    break;
                case 2:
                    System.out.println("Enter id to Delete : ");
                    String id = sc.next();
                    Galgotias.delete(id);
                    break;
                case 3:
                    System.out.println("Enter id to Update : ");
                    String i = sc.next();
                    System.out.println("Enter New Name to Update ");
                    String newName = sc.next();
                    Galgotias.updateName(newName, i);
                    break;
                case 4:
                    Galgotias.show();
                    break;
            
                default:
                    System.out.println("Select correct option");
                    break;
            }

            System.out.println("True for More Operation " + 
                "False for stoping process"
            );
            task  = sc.nextBoolean();
        }
        sc.close();

    }

}
class Stu {
    String name;
    String enrollNo;
    Stu(String name, String enroll) {
        this.name = name;
        this.enrollNo = enroll;
    }
}