package org.sachin.model;

import jakarta.persistence.*;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sid")
    private long sid;

    @Column(name = "Sname")
    private String supplierName;

    @Column(name = "Srank")
    private Double rank;

    @Column(name  = "city")
    private String city;


    public Supplier() {
        super();
    }

    public Supplier(
            String name,
            Double rank,
            String city
    )
    {
        this.supplierName = name;
        this.rank = rank;
        this.city = city;
    }

    public long getSid() {
        return sid;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public Double getRank() {
        return rank;
    }

    public String getCity() {
        return city;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public void setRank(Double rank) {
        this.rank = rank;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
