package org.sachin.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TopicTeaching {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    int id;

}
