import org.junit.jupiter.api.Test;
import org.sachin.EmployeeDao;
import org.sachin.model.Employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeDaoTest {
    @Test
    public void employeeDao() {
        EmployeeDao ed = new EmployeeDao();
        Employee e = ed.getEmployee(101);
        assertNotNull(e);
        System.out.println(e);
    }
}
