package com.galgotias.assesmentspring.controller;

import com.galgotias.assesmentspring.dao.TrainingRepository;
import com.galgotias.assesmentspring.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RestController
public class TrainingController {
    @Autowired
    TrainingRepository repo;
    @RequestMapping("/trainings") // get the training going on
    public List<Training> getCurrentAndFutureTraining() {
        LocalDate today = LocalDate.now();
        Date date = Date.from(today
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
        return  repo.getCurrentAndFutureTrainings(date);
    }

    @RequestMapping("/trainings/upcoming")
    public Training getTrainingByName(@RequestParam("name") String name) {
        LocalDate today = LocalDate.now();
        Date date = Date.from(today
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
        return  repo.getTrainingByName(name,date);
    }

    @RequestMapping("/training/TrainerName")
    public List<Training> getTrainingbyTrainerName(@RequestParam("name") String name) {
        return repo.getTrainingsByTrainerName(name);
    }

    @RequestMapping("/allTrainings")
    public List<Training> getAllTrainings() {
        return repo.findAll();
    }

}
