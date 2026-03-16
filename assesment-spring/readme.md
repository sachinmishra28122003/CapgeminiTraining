# Assesment of SpringBoot 
---

## Question : 
**Create a spring boot project with spring web and hibernate, jpa, db connector and spring data jpa.**

Consider a database name “trainingdb” with a table training (trainingid auto generated with a sequence, topic, startDate, endDate, trainername, venue). Add minimum 6 rows in the table such that 2 trainings have finished, 2 tranings are ongoing and 2 tranings will be upcoming in near future.

Create an entity class for this. When the user sends a request to url “/trainings”, the program sends him all the upcoming and currently going on trainings in JSON format or String format.

On URL:  “/trainings?name=spring” , it searches for all the trainings going on or upcoming the include the word “spring” in the topic.

**On URL : “/trainings/upcoming?name=spring, it searches only for upcoming trainings, that include the word “spring” in topic** 
 ---

## WorkFlow is Like 

### Training Model Class  : 
1. Properties are  : id,topic, start_date, end_date, trainer_date, venue


### Dao 
Employee Repository Using  JPARepository
and some Queries as : 
```java 
public interface TrainingRepository extends JpaRepository<Training, Integer> {
    @Query("from Training t where t.endDate >= :d")
    List<Training> getCurrentAndFutureTrainings(@Param("d") Date d);

    @Query("from Training t where t.topic = :name and t.endDate >= :d")
    Training getTrainingByName(@Param("name") String name, @Param("d") Date d);

    @Query("from Training t where t.trainerName = :name")
    List<Training> getTrainingsByTrainerName(@Param("name") String name);
}
```

### Service Class : 
Employee Service for : 
1. Getting Training name for current and Upcoming
2. Getting Training name through current/upcoming and name
3. Getting Trainings through trainer name
4. Getting all Trainings

```java
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
```

## Controller 

Getting request and forwarding to related service
---
# Project Workflow 
---


##                                                   Controller
                                                          |
                                                          |
                                                          |
##                                                     Services
                                                          |
                                                          |
                                                          |
##                                                   Repository(DAO)
                                                          |
                                                          |
                                                          |
##                                                      Model     


This hierarchy shows that the controller get the request and send to service will get the data and working from Dao / Repositories and give result in model or list of model



