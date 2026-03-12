import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.sachin.DepartmentDao;
import org.sachin.model.Department;

import static org.junit.jupiter.api.Assertions.*;

public class DepartmentDaoTest {

    @Test
    public void testgetDepartment() {
        Department d = DepartmentDao.getDepartment(10);
        assertNotNull(d);
        System.out.println(d);
    }
    @Test
    public void testUpdateDepartment() {
        Department result = DepartmentDao.updateDepartment(10,
                new Department(10,"Admins",100));

        Department d = DepartmentDao.getDepartment(10);
        assertNotNull(result);
        assertNotNull(d);
        assertEquals(d.getDepartmentName(), result.getDepartmentName());
        System.out.println(result);
        System.out.println(d);
    }

    @Test
    public void testSetDepartment() {
        Department n = new Department(12,"R&D", 199);
        Department result = DepartmentDao.setDepartment(n);
        assertNotNull(result);

        Department added = DepartmentDao.getDepartment(11);
        assertNotNull(added);
        assertTrue(n.equals(added));

    }
}
