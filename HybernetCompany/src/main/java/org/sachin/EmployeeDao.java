package org.sachin;

import jakarta.persistence.EntityManager;
import org.sachin.model.Employee;

public class EmployeeDao {
    public Employee getEmployee(int id) {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();
        Employee e =em.find(Employee.class,id);
        return e;
    }
}
