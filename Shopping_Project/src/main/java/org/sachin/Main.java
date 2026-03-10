package org.sachin;

import jakarta.persistence.EntityManager;
import model.Customer;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager em = EntityManagerFactoryMain.getEntityManager();

        Customer c1 = new Customer(
                "Sachin",
                "xyz pvt lts",
                "abc@gmailcom",
                "9044XXXX90",
                new ArrayList<>()
                );

        em.getTransaction().begin();
        em.persist(c1);
        em.getTransaction().commit();

        em.find(Customer.class, 101);

    }
}