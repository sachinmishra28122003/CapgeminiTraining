package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    long item_id;

    String name, type;

    Double cost;
}
