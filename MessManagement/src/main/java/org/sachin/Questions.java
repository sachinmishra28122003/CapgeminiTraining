package org.sachin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.sachin.model.Item;
import org.sachin.model.Supplier;
import org.sachin.model.Supply;

import java.util.List;

public class Questions {

    public static void main(String[] args) {
        EntityManager em = org.sachin.model.EntityManagerFactoryMain.getEntityManager();

        //1
        TypedQuery<String> q1 = em.createQuery(
                "SELECT s.supplierName  FROM Supplier s", String.class
        );
        List<String> supplierNames = q1.getResultList();
        System.out.println("All Supplier Names: " + supplierNames);

        //2
        TypedQuery<Supplier> q2 = em.createQuery(
                "SELECT s FROM Supplier s WHERE s.city = :loc", Supplier.class
        );
        q2.setParameter("loc", "Delhi");
        List<Supplier> delhiSuppliers = q2.getResultList();
        System.out.println("Suppliers from Delhi: " + delhiSuppliers);

        //3
        TypedQuery<String> q3 = em.createQuery(
                "SELECT s.itemSupplied.itemName FROM Supply s WHERE s.s.sid = :sid",
                String.class
        );
        q3.setParameter("sid", 1L);
        List<String> itemsBySupplier1 = q3.getResultList();
        System.out.println("Items supplied by supplier 1: " + itemsBySupplier1);

        em.close();
    }
}