package org.sachin.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name  = "billno")
    private long supplyId;

    @ManyToOne
    @JoinColumn(name = "supplierid")
    private Supplier s;

    @ManyToOne
    @JoinColumn(name  = "itemid")
    private Item itemSupplied;

    @Column(name = "datesupply")
    private Date dateSupply;

    @Column(name = "Price")
    private Double cost;

    @Column(name = "qunatity")
    private long qty;

    public Supply() {
        super();
    }

    public  Supply(
            Supplier s,
            Item i,
            Date d,
            Double price,
            long qty
    ) {
        this.s = s;
        this.itemSupplied = i;
        this.dateSupply = d;
        this.cost = price;
        this.qty = qty;
    }

    // getters

    public long getSupplyId() {
        return supplyId;
    }

    public Supplier getS() {
        return s;
    }

    public Item getItemSupplied() {
        return itemSupplied;
    }

    public Date getDateSupply() {
        return dateSupply;
    }

    public Double getCost() {
        return cost;
    }

    public long getQty() {
        return qty;
    }

    // setters


    public void setSupplyId(long supplyId) {
        this.supplyId = supplyId;
    }

    public void setS(Supplier s) {
        this.s = s;
    }

    public void setItemSupplied(Item itemSupplied) {
        this.itemSupplied = itemSupplied;
    }

    public void setDateSupply(Date dateSupply) {
        this.dateSupply = dateSupply;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setQty(long qty) {
        this.qty = qty;
    }
}
