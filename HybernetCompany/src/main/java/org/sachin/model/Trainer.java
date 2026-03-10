package org.sachin.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // DB will have auto_
    long trainerid;
    @Column(unique = true)
    long capgtrainerid;
    @Column(nullable = false)
    String name;
    String company;
    String specialization;
}
