package com.galgotias.assesmentspring.service;

import com.galgotias.assesmentspring.model.Training;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TrainingService {
    List<Training> getCurrentAndFutureTraining();
    Training getTrainingByName(@RequestParam("name") String name);
    List<Training> getTrainingbyTrainerName(@RequestParam("name") String name);
    List<Training> getAllTrainings();
}
