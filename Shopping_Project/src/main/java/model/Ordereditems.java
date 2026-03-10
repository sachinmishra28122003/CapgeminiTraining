package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Ordereditems {
    @Id
    long ordered_item_id;

    @OneToMany
    Item item ;

    long quantity;

}
