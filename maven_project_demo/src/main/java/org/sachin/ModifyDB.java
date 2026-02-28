package org.sachin;

import org.sachin.model.Employee;
import org.sachin.JavaDbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ModifyDB {
    public int enterEmployeeData(Employee e) {
        try (Connection con = JavaDbConnection.getConnection()) {
            PreparedStatement ps = con.prepareStatement("Insert into employee values(?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1,e.getEmp_id());
            ps.setString(2,e.getFirstName());
            ps.setString(3,e.getLastName());
            ps.setString(4,e.getEmail());
            ps.setString(5,e.getPhoneNumber());
            ps.setDate(6,e.getHireDate());
            ps.setString(7, e.getJobTitle());
            ps.setObject(8,e.getSalary());
            ps.setObject(9,e.getManagerId());
            ps.setObject(10,e.getDept_id());
            int rowsUpated = ps.executeUpdate();
            if(rowsUpated != 1) {
                System.out.println("Unable to add");
                return  0;
            }
            System.out.println("ADDED Successfully");
            return rowsUpated;
        }
        catch (SQLException a) {
            a.printStackTrace();
        }
        return  0;
    }

    public static int deleteid(int id) {
        try(Scanner sc = new Scanner(System.in);
            Connection con  = JavaDbConnection.getConnection()) {
            System.out.print("Enter Employee ID is  : ");
//            int id = sc.nextInt();
            PreparedStatement ps1 = con.prepareStatement("UPDATE employee SET manager_id = ? WHERE  manager_id = ?");
            ps1.setObject(1,null);
            ps1.setObject(2,id);
            int row = ps1.executeUpdate();
            PreparedStatement ps = con.prepareStatement("DELETE from employee where employee_id = ?");
            ps.setInt(1,id);

            int rowUpdates = ps.executeUpdate();
            if(rowUpdates!=1) {
                System.out.println("NOt Exist");
                return id;
            }
            System.out.println("Deleted Successfully !");
            return  id;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return  -1;
    }
}
