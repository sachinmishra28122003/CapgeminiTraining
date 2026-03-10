package org.sachin;

import jakarta.persistence.EntityManager;
import org.sachin.model.Department;

public class DepartmentDao {

    //  fetch things
    public static Department getDepartment(int id) {
        EntityManager emf = EntityManagerFactoryMain.getEntityManager();
        Department d = emf.find(Department.class , id);
        return d;
    }
    // inserting into department table
    public static Department setDepartment(Department d) {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();
        em.close();
        return d;
    }

    // update department table
    public static  Department updateDepartment(int id, Department change) {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();
        Department old = em.find(Department.class,id);
        if(old != null) {
            em.getTransaction().begin();
            old.setDepartmentName(change.getDepartmentName());
            em.persist(old);
            em.getTransaction().commit();
            em.close();
            return old;
        }

        em.close();
        return null;
    }
}
