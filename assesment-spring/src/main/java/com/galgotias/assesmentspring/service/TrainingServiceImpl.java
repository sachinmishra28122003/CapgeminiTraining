package com.galgotias.assesmentspring.service;

import com.galgotias.assesmentspring.dao.TrainingRepository;
import com.galgotias.assesmentspring.model.Training;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService{

    @Autowired
    TrainingRepository repo;

    public List<Training> getCurrentAndFutureTraining() {
        LocalDate today = LocalDate.now();
        Date date = Date.from(today
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
        return  repo.getCurrentAndFutureTrainings(date);
    }


    public Training getTrainingByName( String name) {
        LocalDate today = LocalDate.now();
        Date date = Date.from(today
                .atStartOfDay(ZoneId.systemDefault())
                .toInstant());
        return  repo.getTrainingByName(name,date);
    }

    public List<Training> getTrainingbyTrainerName( String name) {
        return repo.getTrainingsByTrainerName(name);
    }

    public List<Training> getAllTrainings() {
        return repo.findAll();
    }
}
