package model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    // Not in my sql
//    @SequenceGenerator(name = "MySqGenerator",
//    initialValue = 101,
//    allocationSize = 1)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long customer_id;

    String name, address, email, phone;

    // default lazy and will not fetch entire order from table
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ordered_items")
    List<AnOrder> ordered_items = new ArrayList<>();


    // constructor
    public Customer() {
        super();
    }
    // with parameter
    public Customer(
            String name,
            String address,
            String email,
            String phone,
            List<AnOrder> l
    ) {
        this.name  = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.ordered_items = l;
    }
}
