package com.galgotias.assesmentspring.dao;

import com.galgotias.assesmentspring.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface TrainingRepository extends JpaRepository<Training, Integer> {
    @Query("from Training t where t.endDate >= :d")
    List<Training> getCurrentAndFutureTrainings(@Param("d") Date d);

    @Query("from Training t where t.topic = :name and t.endDate >= :d")
    Training getTrainingByName(@Param("name") String name, @Param("d") Date d);

    @Query("from Training t where t.trainerName = :name")
    List<Training> getTrainingsByTrainerName(@Param("name") String name);
}
