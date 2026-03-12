package org.sachin;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerFactoryMain {
    public static EntityManagerFactory emf = null;
    public static EntityManager em= null;
    public static  EntityManagerFactory getEntityManagerFactory() {
        if(emf == null) {
            emf = Persistence.createEntityManagerFactory("shopping_pu");
            return emf;
        }
        else
            return emf;
    }
    public static EntityManager getEntityManager() {
        if(emf == null) {
            emf = getEntityManagerFactory();
            em = emf.createEntityManager();
            return  em;
        }
        else {
            em = emf.createEntityManager();
            return em;
        }
    }
}
