package org.sachin;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.sachin.model.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EntityManagerFactoryMain {
    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;
    public  static EntityManagerFactory getEntityManagerFactory() {
        if(emf == null)
            emf = Persistence
                    .createEntityManagerFactory("company_db_pu");
        System.out.println(emf);
        return emf;
    }


    public static EntityManager getEntityManager() {
        if(emf == null) {
            emf = getEntityManagerFactory();
        }
        if(em == null || !em.isOpen()) {
            em = emf.createEntityManager();
        }
        System.out.println(em);
        return em;
    }


}