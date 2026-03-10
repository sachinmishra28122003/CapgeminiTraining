package org.sachin.model;

import jakarta.persistence.*;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itemid")
    private long itemid;

    @Column(name = "name")
    private String itemName;

    @Column(name = "Type")
    private String itemType;

    public Item() {
        super();
    }
    public Item(
            String name,
            String type
    )
    {
        this.itemName = name;
        this.itemType = type;
    }

    // getters
    public long getItemid() {
        return itemid;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemType() {
        return itemType;
    }


    // setters
    public void setItemid(long itemid) {
        this.itemid = itemid;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
}
