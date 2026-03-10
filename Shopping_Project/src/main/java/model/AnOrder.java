package model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class AnOrder {
    @TableGenerator(
            name = "allseqgenerator",
            allocationSize = 1,
            initialValue = 101,
            pkColumnName = "seqname",
            pkColumnValue = "nextorderid"
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.TABLE,
            generator = "allseqgenerator"
    )
    long order_id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cutomers")
    Customer customer;

    int number_items;

    Double amount;

    String delivery_address;

    @OneToOne
    @JoinColumn(name = "payment_id")
    Payment payment;

    List<Ordereditems> items;
}
