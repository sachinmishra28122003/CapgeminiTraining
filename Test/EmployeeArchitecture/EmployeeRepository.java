package EmployeeArchitecture;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;
//import java.util.List;

public class EmployeeRepository {

	private static final List<Employee> employees;
	private static final List<Department> departments ;
	
	static {
		departments = new ArrayList<Department>();
		//populate departments
		departments.add(new Department(10,"Administration",100));
		departments.add(new Department(20,"Production",201));
		departments.add(new Department(30,"Sales",124));
		departments.add(new Department(40,"Finance",205));
		departments.add(new Department(50,"Customer Support",100));
		//populate employees 
		employees= new ArrayList<Employee>();
		employees.add(new Employee( 100, "Steven", "King", 
				"SKING", "515.123.4567", LocalDate.of(1997,Month.JUNE,17),
				"President", 24000,null, departments.get(0)));
		employees.add(new Employee( 101, "Neena", "Kochhar", 
				"NKOCHHAR", "515.123.4568", LocalDate.of(1999,Month.SEPTEMBER,21),
				"Vice President", 17000,100, departments.get(0)));
		employees.add(new Employee( 102, "Lex", "De Haan", 
				"LDEHAAN", "515.123.4569", LocalDate.of(2003,Month.JUNE,13),
				"Vice President", 17000,100, departments.get(0)));
		employees.add(new Employee( 201, "Michael", "Hartstein", 
				"MHARTSTE", "515.123.5555", LocalDate.of(1996,Month.FEBRUARY,17),
				"Manager", 13000,100, departments.get(1)));
		employees.add(new Employee( 202, "Pat", "Fay", 
				"PFAY", "603.123.6666", LocalDate.of(2007,Month.AUGUST,17),
				"Deputy Manager", 6000,201, departments.get(1)));
		employees.add(new Employee( 124, "Kevin", "Mourgos", 
				"KMOURGOS", "650.123.5234", LocalDate.of(2009,Month.NOVEMBER,16),
				"Manager", 5800,100, departments.get(2)));
		employees.add(new Employee( 141, "Trenna", "Rajs", 
				"TRAJS", "650.121.8009", LocalDate.of(1995,Month.OCTOBER,17),
				"Clerk", 3500,124, departments.get(2)));
		employees.add(new Employee( 205, "Shelley", "Higgins", 
				"SHIGGINS", "515.123.8080", LocalDate.of(2004,Month.JUNE,07),
				"Manager", 12000,101, departments.get(3)));
		employees.add(new Employee( 206, "William", "Gietz", 
				"WGIETZ", "515.123.8181", LocalDate.of(2004,Month.JUNE,07),
				"Accountant", 8300,205, departments.get(3)));
		employees.add(new Employee( 199, "Douglas", "Grant", 
				"DGRANT", "650.507.9844", LocalDate.of(2000,Month.JANUARY,13),
				"Clerk", 2600,205, departments.get(3)));
		employees.add(new Employee( 200, "Jennifer", "Whalen", 
				"JWHALEN", "515.123.4444", LocalDate.of(2007,Month.SEPTEMBER,17),
				"Admin Assistant", 4400,102, null));
		employees.add(new Employee( 198, "Donald", "OConnell", 
				"DOCONNEL", "650.507.9833", LocalDate.of(2009,Month.JUNE,21),
				"Clerk", 2600,null, null));
	}
	
	public static List<Employee> getEmployees() {
		return employees;
	}
	public static List<Department> getDepartments() {
		return departments;
	}

	/**
	 * Q1
	 */
	// Sum of all employee Salary 
	public static void salarySumEmployee() {
//		Stream<Employee> st = employees.stream();
//		final int[] sum = {0};
//		st.forEach(n -> sum[0] += n.getSalary());
//		System.out.println("Total Salary : " + sum[0]);
//		employees.stream().mapToDouble(e ->e.getSalary()).sum();


//		Also

		Optional<Double> salary = employees.stream().map(e -> e.getSalary()).reduce((s1,s2) -> s1 + s2);
		System.out.println(salary.get());
	}




	/**
	 * Q2
	 */
	public static void employeesInEachDepartment() {
		Stream<Department> sd = departments.stream();
		sd.forEach(d -> {
			long count = employees.stream()
					.filter(e -> e.getDepartment() != null) // filtering null from the stream
					.filter(e -> e.getDepartment().equals(d)) // we are given direct object of department
					.count();

			System.out.println("Total Employee from Department : "
					+ d.getDepartmentName() + " is : " + count);
		});
	}

	/**
	 *Q3
	 *
	 */
	public static void  seniorMost() {
		Optional<Employee> e = employees.stream().min((a, b) -> {
			LocalDate aHire = a.getHireDate();
			LocalDate bHire = b.getHireDate();
			if(aHire.getYear() > bHire.getYear()) {
				return  1;
			}
			else if(aHire.getYear() < bHire.getYear()) {
				return -1;
			}
			else if(aHire.getYear() == bHire.getYear()  && aHire.getMonthValue() > bHire.getMonthValue()) {
				return 1;
			}
			else if(aHire.getYear() == bHire.getYear()  && aHire.getMonthValue() < bHire.getMonthValue()) {
				return -1;
			}
			else if((aHire.getYear() == bHire.getYear())  &&
					(aHire.getMonthValue() == bHire.getMonthValue()) &&
					(aHire.getDayOfMonth()) > bHire.getDayOfMonth()) {
				return 1;
			}
			else if((aHire.getYear() == bHire.getYear())  &&
					(aHire.getMonthValue() == bHire.getMonthValue()) &&
					(aHire.getDayOfMonth()) < bHire.getDayOfMonth()) {
				return -1;
			}
			else {
				return 0;
			}
		});
		System.out.println(e);

	}

	/**
	 *
	 * Q4.
	 */

	public static void getServicePeriod() {
		//getting current date and time
		LocalDate d = LocalDate.now();
		// making stream
		employees.stream().forEach(e->  {
			LocalDate hire = e.getHireDate();
			int durationMonth, durationYear, durationDays;
			durationYear = d.getYear() - hire.getYear() ;
			durationMonth = Math.abs(hire.getMonthValue() - d.getMonthValue());

			// non negative value for month and days since it can be greater or small

			durationDays = Math.abs(hire.getDayOfMonth() - d.getDayOfMonth());

			System.out.println("Employee " + e.getFirstName() +
					" is Working here for " + durationDays +
					" Days " + durationMonth +
					" Months " + durationYear + " Years .");
		} );
	}

	/**
	 *
	 * Q5
	 */

	public static void employeeWithoutDepartment() {
		employees.stream()
				.filter(e -> e.getDepartment() == null)
				.forEach(System.out::println);
	}

	/**
	 * Q6
	 */
	public static void departmentWithoutEmployee() {
		departments.stream().forEach( d -> {
			boolean exists  = employees.stream()
					.anyMatch(e -> e.getDepartment() != null &&
							e.getDepartment().getDepartmentId()==d.getDepartmentId());
			if(!exists) {
				System.out.println(d);
			}
		});
	}

	/**
	 *
	 * Q7
	 */

	public static void departmentWithHighestEmployee() {
		long max = 0, index = 0;
		Department maxDepartment = departments.stream()
				.max(Comparator.comparingLong(d ->
						employees.stream()
					 			 .filter(e ->
										 e.getDepartment() != null &&
										 e.getDepartment()
												 .getDepartmentId() == d.getDepartmentId()
								 )
								 .count()
				))
				.orElse(null);
		if(maxDepartment != null) {
			long employeeCount = employees.stream()
					.filter(e ->
							e.getDepartment() != null && e.getDepartment().getDepartmentId() == maxDepartment.getDepartmentId())
					.count();

			System.out.println("Department with highest employees: "
								+ maxDepartment.getDepartmentName()
								+ " | Count: " + employeeCount);
		}
	}

	public static void main(String[] args) {

		salarySumEmployee();
//		employeesInEachDepartment();
//		seniorMost();
//		getServicePeriod();
//		employeeWithoutDepartment();
//		departmentWithoutEmployee();
//		departmentWithHighestEmployee();
	}

}


/***
 * 1.	Find out the sum of salary of all employees.
 * 2.	List out department names and count of employees in each department.
 * 3.	Find out the senior most employee of an organization.
 * 4.	List employee name and duration of their service in months and days.
 * 		5.	Find out employees without department.
 * 6.	Find out department without employees.
 * 7.	Find departments with highest count of employees.
 * 8.	List employee name, hire date and day of week on which employee has started.
 * 9.	Revise exercise 10.13 to list employee name, hire date and day of week for employee started on Friday. (Hint:  Accept the day name for e.g. FRIDAY and list all employees joined on Friday)
 * 		10.	List employee’s names and name of manager to whom he/she reports. Create a report in format “employee name reports to manager name”.
 * 		11.	List employee name, salary and salary increased by 15%.
 * 		12.	Find employees who didn’t report to anyone (Hint: Employees without manager)
 * 13.	Create a method to accept first name and last name of manager to print name of all his/her subordinates.
 * 		14.	Sort employees by their
 * •	Employee id
 * •	Department id
 * •	First name
 */
