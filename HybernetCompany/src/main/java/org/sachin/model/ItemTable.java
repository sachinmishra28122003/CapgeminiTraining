package org.sachin.model;

import jakarta.persistence.*;

@Entity
public class ItemTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Db should have autoincrement
    int temp_id;
    String item_type;
    String item_name;
}
