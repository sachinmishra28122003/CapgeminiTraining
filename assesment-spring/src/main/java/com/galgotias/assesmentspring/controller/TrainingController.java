package com.galgotias.assesmentspring.controller;

import com.galgotias.assesmentspring.dao.TrainingRepository;
import com.galgotias.assesmentspring.model.Training;
import com.galgotias.assesmentspring.service.TrainingService;
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
    TrainingService service;
    @RequestMapping("/trainings") // get the training going on
    public List<Training> getCurrentAndFutureTraining() {
        return service.getCurrentAndFutureTraining();
    }

    @RequestMapping("/trainings/upcoming")
    public Training getTrainingByName(@RequestParam("name") String name) {
        return  service.getTrainingByName(name);
    }

    @RequestMapping("/training/TrainerName")
    public List<Training> getTrainingbyTrainerName(@RequestParam("name") String name) {
        return service.getTrainingbyTrainerName(name);
    }

    @RequestMapping("/allTrainings")
    public List<Training> getAllTrainings() {
        return service.getAllTrainings();
    }

}
