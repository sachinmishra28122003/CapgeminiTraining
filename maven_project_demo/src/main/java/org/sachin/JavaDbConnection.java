package org.sachin;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.sachin.model.Department;
import org.sachin.model.Employee;
import javax.xml.transform.Result;
import java.sql.*;
import java.util.Scanner;

public class JavaDbConnection {
    public static Connection getConnection()  {
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUser("root");
        ds.setPassword("2003");
        ds.setUrl("jdbc:mysql://localhost:3306/company_db");
        Connection con = null;
        try{
             con = ds.getConnection();
        }catch (SQLException e) {
            e.printStackTrace();
        }
//        finally {
//               if(con != null) {
//                   try{
//                       con.close();
//                   }catch (SQLException e) {
//                       e.printStackTrace();
//               }
//           }
//        }
        return con;
    }
    public static void printEmployee() throws SQLException {
        // try with resource which implement auto closable
        try(Connection con = getConnection()) {

            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("Select * from employee");
            while(rs.next() == true) {
                int empId = rs.getInt(1);
                String firstName = rs.getString(2);
                String LastName = rs.getString(3);
                System.out.println(empId + " " + firstName + " " + LastName);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Employee getEmployeeById(int id) {
//        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
//        System.out.print("Enter your Employee_ID : ");
//        int id = sc.nextInt();
        try(Connection con = getConnection()) {
            PreparedStatement st = con.prepareStatement("Select * from employee where employee_id = ?");
            st.setInt(1,id);

            ResultSet rs = st.executeQuery();
//             e = new Employee();
            if(rs.next() == false) {
                System.out.println("Employeee Not Exist");
                return null;
            }
            e.setEmp_id(rs.getInt(1));
            e.setFirstName(rs.getString(2));
            e.setLastName(rs.getString(3));
            e.setHireDate(rs.getDate(6));
            e.setJobTitle(rs.getString(7));
            e.setPhoneNumber(rs.getString(5));
            e.setSalary(rs.getObject(8,Double.class));
            e.setDept_id(rs.getObject(10,Integer.class));
            e.setEmail(rs.getString(4));
            e.setManagerId(rs.getObject(9,Integer.class));

            // attaching department
            int dept_id = rs.getInt("department_id");
            PreparedStatement ps2 = con.prepareStatement("SELECT  * from department where department_id = ?");
            ps2.setInt(1,dept_id);
            ResultSet department = ps2.executeQuery();
            Department d = new Department();
            if(department.next())  {
                d.setDept_id(department.getInt("department_id"));
                d.setManagerId(department.getInt("manager_id"));
                d.setDepartmentName(department.getString("department_name"));
            }
            e.setDepartment(d);

            System.out.println(e);
            System.out.println(d);
        }catch (SQLException se) {
            se.printStackTrace();
        }
        return  e;
    }


}
