import java.util.*;
public class EmployerPayRollSystem {
    public static void menu() {
        System.out.println("-------------------Tasks----------------------");
        System.out.println("1.Add new Employee");
        System.out.println("2.Mark Attendence with id");
        System.out.println("3.Get The pay slip by id ");
        System.out.println("4.Get Employee List");
        System.out.println("5.Promote");
    }
    public static  void main(String args[]) {
        Scanner sc  = new Scanner(System.in);
        Employer XYZorg ;

        // start projection of code 
        System.out.println("Type true if u want to start a Company : ");
        boolean i = sc.nextBoolean();
        if(i) {
            XYZorg = new Employer();
        }
        else {
            XYZorg = null;
        }
        if(XYZorg != null) {
            boolean perform = true;
            while(perform) {
                System.out.println("Perform Task");
                menu();
                int select = sc.nextInt();
                // selecting for the task
                switch (select) {
                    case 1: // Adding Employee
                        System.out.println("Define Salary : ");
                        int salary = sc.nextInt();
                        System.out.println("Hired as (job role ) ");
                        String role = sc.next();
                        XYZorg.addEmployee(salary, new StringBuilder(role));
                        break;
                
                    case 2: // Marking attendence
                        System.out.println("Enter id of Employee : ");
                        int id = sc.nextInt();
                        XYZorg.markAttendence(id);
                        break;
                    
                    case 3: // generating a final pay slip
                        System.out.println("Enter id of Employee : ");
                        int d = sc.nextInt();
                        XYZorg.paySlip(d);
                        break;

                    case 4:  // Getting all employees data in organization
                        System.out.println("*************** List of the employees are  ****************");
                        XYZorg.getEmployees();
                        break;

                    case 5: // Promoting job role of Employee
                        sc.nextLine(); // clear the buffer

                        System.out.println("Enter promoted role ");
                        String p = sc.nextLine();
                        System.out.println("Enter new Salary according to job role : ");
                        int sal = sc.nextInt();
                        System.out.println("Enter The employee ID : ");
                        int card = sc.nextInt();

                        XYZorg.promote(p, card,sal);
                        break;          
                    default:
                        System.out.println("Wrong choice Please check menu before entering");
                        break;
                }

                System.out.println("True for more operations and False for closing.");
                boolean result = sc.nextBoolean();
                perform = result;
            }

            sc.close();
        }

    }
}

// Admin or backend of the system Employer pay roll management 
// it is basically doing all operations necessary for the system
class Employer {
    ArrayList<Employee> emp;
    Employer() {
        emp = new ArrayList<>();
    }
    // Adding employees by generating  id as ArrayList Index
    void addEmployee(int salary, StringBuilder role) {
        emp.add(new Employee(salary, role));
        System.out.println("Employee added wittreh id  :" +
           (emp.size() - 1)
        );
    }
    // marking attendence individually such that if an automatic system implemented
    // 
    void markAttendence(int id) { //  marking attendence using id of employee
        emp.get(id).attendence += 1;
        System.out.println("Total Attendence of Employee is  : " +
            emp.get(id).attendence
        );
    }

    // Generating Pay slip according to attendence and company policy
    // 30 days : Bonus and less than 20 days 10 % deduction of salary
    void paySlip(int id) {
        // 30 days 15% bonus
        int atten = emp.get(id).attendence;
        if(atten == 30) {
            int salary = emp.get(id).salary/30;
            System.out.println("Your Pay Check is  : " + 
                salary +
                " + " +
                salary  * 0.15
                + " = " +
                (salary + salary* 0.15)
            );
        }
        else if(atten <= 20) {
            int salary = emp.get(id).salary/30;
            System.out.println("Your Pay Check is  : " + 
                salary +
                " - " +
                salary * 0.10
                + " = " +
                (salary - salary * 0.10)
            );
        }
        // 10 days and above absent  deduct 10 %

        emp.get(id).attendence = 0;
    }

    // getting all employees data for refrence 
    void getEmployees() {
        int count = 0;
        for(Employee e : emp) {
            System.out.println("ID : "  + count );
            System.out.println("ROLE : " + e.role);
            System.out.println("Total days present : " + e.attendence);

            System.out.println();
            count++;
        }
    }
    
    // ppromote role and salary
    void promote(String role, int id, int sal) {
        emp.get(id).role = new StringBuilder(role);
        emp.get(id).salary = sal;
        System.out.println("Role of Employee with id : " +
            id + 
            "is now  as : "+ 
            role
        );
        System.out.println("Updated Salary is  : " + 
            emp.get(id).salary
        );
    }

}

// working as database to store employee data in an organization
class Employee { 
    int attendence;
    int salary;
    StringBuilder role;
    Employee(int salary, StringBuilder role) {
        this.attendence = 0;
        this.salary = salary;
        this.role = role;
    } 
}
