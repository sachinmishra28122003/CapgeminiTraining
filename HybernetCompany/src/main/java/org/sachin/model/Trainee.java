package org.sachin.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence. Id;
import jakarta.persistence. SequenceGenerator;

@Entity
public class Trainee {
    @SequenceGenerator (name = "traineeseq", allocationSize = 1, initialValue = 1001, sequenceName = "")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "traineeseq")
    long superid;
    @Column(nullable = false)
    String name;
    String institute;
    String email;
    String phone;
    String bid;
}
