package org.sachin.model;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Batch {
    @TableGenerator(name = "batchidgenerator", allocationSize = 1, initialValue = 101, table = "allidgenerator", valueColumnName = "nextBatchid")
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE ,  generator = "trainSeq")
    long bid;
    String name;
    Date startDate;
    Date endDate;
    String content;
    String venue;
    @ManyToMany
    @JoinTable(name="topicteaching",
            joinColumns = { @JoinColumn(name="bid")},
            inverseJoinColumns = { @JoinColumn(name="trainerid")})
    List<Trainer> trainers = new ArrayList<>();// control

    @OneToMany(mappedBy = "batch")
    List<TopicTeaching> topicsTaught = new ArrayList<>();
}