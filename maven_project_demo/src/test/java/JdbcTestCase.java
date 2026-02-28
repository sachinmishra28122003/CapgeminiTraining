import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.sachin.JavaDbConnection;
import org.sachin.ModifyDB;
import org.sachin.model.Department;
import org.sachin.model.Employee;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class JdbcTestCase {
    /**
     * Employee for testing
     */

    Employee emp = new Employee(101,
            "Neena","Kochhar",
            "NKOCHHAR","515.123.4568",
            Date.valueOf("1999-09-21"),"Vice President",17000.0,
            100,10, new Department(10,"Administration",100)
            );




    @Test
    public void connection() {
        Connection con = JavaDbConnection.getConnection();
        assertNotNull(con);
    }

    @Test
    public void testQuery() {
        try {
            JavaDbConnection.printEmployee();
        }
        catch (SQLException e){
            System.out.println("fail");
            fail();
        }
    }

    @Test
    public void testInsert() {
        Employee e = new Employee();
        e.setEmp_id(210);
        e.setFirstName("PR");
        e.setLastName("EFG");
        e.setEmail(null);
        e.setPhoneNumber("1610916322");
        e.setHireDate(Date.valueOf(LocalDate.now()));
        e.setJobTitle("Manager");
        e.setSalary(240000.0);
        e.setManagerId(100);
        e.setDept_id(10);

        int i = new ModifyDB().enterEmployeeData(e);
        assertEquals(i,1);

    }

//
//    @ParameterizedTest
//    @CsvSource(value ={"100,emp"})
//    public void testGetEmployeeById(int empId, Employee e) {
//        Employee actual = JavaDbConnection.getEmployeeById();
//        assertTrue(e.equalsTo(actual));
//    }


    @Test
    public void testDelete() {
        Employee e = JavaDbConnection.getEmployeeById(100);
        int id = ModifyDB.deleteid(100);
        assertNull(JavaDbConnection.getEmployeeById(100));
        new ModifyDB().enterEmployeeData(e);
    }

    @AfterAll
    public static void closeConnection() {
        Connection con = JavaDbConnection.getConnection();
        try{
            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
