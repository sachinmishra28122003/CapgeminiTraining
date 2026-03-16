package com.galgotias.assesmentspring.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "training")
public class Training {
    @Id
    @Column(name = "training_id")
    @GeneratedValue
    int id;

    @Column(name = "topic")
    String topic;

    @Column(name = "start_date")
    Date startDate;

    @Column (name = "end_date")
    Date endDate;

    @Column (name = "trainer_name")
    String trainerName;

    @Column (name = "venue")
    String venue;

    @Override
    public String toString() {
        return "training{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", trainerName='" + trainerName + '\'' +
                ", venue='" + venue + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public String getVenue() {
        return venue;
    }
}
