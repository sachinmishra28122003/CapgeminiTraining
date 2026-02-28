import java.util.ArrayList;

public class Day8 {

    public static void main(String args[]) {

        // 1st UML
        Person p1 = new Person("xyz", 21, 98765, "7/8/2026");
        System.out.println(p1.getName());
        System.out.println("Passport Issue date  is   :  "  + 
                            p1.getPassport().issueDate + 
                            "Passport Nummber is  : " + 
                            p1.getPassport().getPassportNumber());

        // 2nd UML
        Teacher t1  = new Teacher(123,"abc");
        t1.addStudents(1, "www");
        t1.addStudents(2, "qqq");
        ArrayList<Student> a = t1.getStudents();
        for(int i = 0 ; i < a.size(); i++) {
            System.out.println(i + 
                            "st Students Name : "  + 
                             a.get(i).getName());
        }

        // 3rd UML

        User u1 = new User("abc@gmail.com", "abc", "77238742653");
        System.out.println("User Profile's Email : " + 
                            u1.getProfile().getEmail());


        // 4th UML
        Department d = new Department("123", "Accounts");
        d.addEmployee("222", "mmm");
        d.addEmployee("221", "mmm");
        d.addEmployee("223", "kkkk");
        ArrayList<Employee> e = d.getEmployees();
        System.out.println("Employee in department : ");
        for(int i = 0; i < e.size(); i++) {
            System.out.println("Name of emp : "+ i + e.get(i).getName() );
        }
    }
}
// class person

class Person {
    private String name;
    int age;
    private Passport passport;
    Person(String name , int  age, int passNo , String issueDate) {
        this.name = name;
        this.age = age;
        this.passport = new Passport(passNo, issueDate);
    }
    String getName() {
        return this.name;
    }
    Passport getPassport() {
        return this.passport;
    }
}
//    1
//    |    
//    |   
//    |
//    1
class Passport{
    String issueDate;
    private int number;
    Passport(int passNo, String issue) {
        this.issueDate = issue;
        this.number = passNo;
    }
    int getPassportNumber() {
        return number;
    }
}


// 1 to many

class Teacher {

    int teacherId;
    String name;
    Teacher(int teacherId, String name) {
        this.name = name;
        this.teacherId = teacherId;
    }
    ArrayList<Student> s = new ArrayList<>(); 
    void addStudents(int rollNo, String name ) {
        s.add(new Student(rollNo, name));
    }
    ArrayList<Student> getStudents() {
        return s;
    }
}
//    1
//    |    
//    |   
//    |
//    *
class Student {
    int rollNo;
    private String name ;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}


// 1 to 1 

class User {
    String userId;
    String name;
    private Profile p;
    User(String userId, String name, String number) {
        this.userId = userId;
        this.name = name;
        this.p = new Profile(userId, number);
    }

    Profile getProfile() {
        return p;
    }
}
//    1
//    |    
//    |   
//    |
//    1
class Profile {
    private String email;
    String number;
    Profile(String email, String number) {
        this.email = email;
        this.number = number;
    }
    String getEmail() {
        return this.email;
    }
}


// 1 to many 
class Department {
    String departmentId;
    String departmentName;
    ArrayList<Employee> e;
    Department(String deptId, String deptName) {
        this.departmentId = deptId;
        this.departmentName = deptName;
        this.e = new ArrayList<>();
    }

    void addEmployee(String empId, String name) {
        e.add(new Employee(empId, name));
    }

    ArrayList<Employee> getEmployees() {
        return e;
    }
}

//    1
//    |    
//    |   
//    |
//    *
class Employee {
    String empId;
    private String name;
    Employee(String empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}