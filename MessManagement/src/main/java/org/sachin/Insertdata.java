package org.sachin;

import jakarta.persistence.EntityManager;
import org.sachin.model.EntityManagerFactoryMain;
import org.sachin.model.Item;
import org.sachin.model.Supplier;
import org.sachin.model.Supply;

import java.sql.Date;

public class Insertdata {

    public static void insertSupplier(){
        EntityManager em = EntityManagerFactoryMain.getEntityManager();
        Supplier s1 = new Supplier(
                "Ranjan Enterprices",
                4.5,
                "Delhi"
        );

        Supplier s2 = new Supplier(
                "Indian Supply",
                3.4,
                "Gurugram"
        );

        em.getTransaction().begin();
        em.persist(s1);
        em.persist(s2);
        em.getTransaction().commit();
        em.close();
    }

    public static void insertItem() {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();
        Item it1 = new Item(
                "Tomato",
                "Veg"
        );

        Item it2 = new Item(
                "Onion",
                "Veg"
        );

        Item it3 = new Item(
                "Sugar",
                "Veg"
        );

        em.getTransaction().begin();
        em.persist(it1);
        em.persist(it2);
        em.persist(it3);
        em.getTransaction().commit();
        em.close();
    }


    public static void insertSupply() {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();

        Supplier s1 = em.find(Supplier.class, 1);
        Supplier s2 = em.find(Supplier.class, 2);

        Item i1 = em.find(Item.class, 1);
        Item i2 = em.find(Item.class, 2);
        Item i3 = em.find(Item.class, 3);

        Supply b1 = new Supply(
                s1,
                i2,
                Date.valueOf("2019-03-03"),
                36.0,
                50
        );

        Supply b2 = new Supply(
                s1,
                i3,
                Date.valueOf("2019-05-05"),
                20.0,
                45
        );

        Supply b3 = new Supply(
                s2,
                i1,
                Date.valueOf("2019-08-15"),
                50.0,
                10
        );

        em.getTransaction().begin();
        em.persist(b1);
        em.persist(b2);
        em.persist(b3);
        em.getTransaction().commit();

        em.close();
    }
}
