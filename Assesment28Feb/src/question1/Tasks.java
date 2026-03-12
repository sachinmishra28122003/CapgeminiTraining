package question1;

import java.util.List;

public class Tasks {

    static List<Owner> carOwners = CarRepository.getOwners();
    static List<Car> cars = CarRepository.getCars();
    // 1. Return the list of names of the owners currently having no cars

    public static void ownersWithNoCars() {
        carOwners.stream()
                .filter(o -> o.getCars() == null)
                .forEach(System.out::println);
    }

    // 2. create a map of name of person and number of cars he/she owns
    public static void nameOfPersonAndNumberOfCar() {
        carOwners.stream()
                .forEach(e ->
                {
                    System.out.println("Name : " + e.getName()
                            + " Owned Cars : "
                            +( e.getCars() == null ? 0 : e.getCars().size()) );
                });
    }

    // 3. List cars not owned by any one

    public static void carsNotOwned() {
        cars.stream()
                .filter(c -> carOwners.stream()
                        .filter(o -> o.getCars() != null)
                        .noneMatch(o -> o.getCars().contains(c)))
                .forEach(System.out::println);
    }


    public static void main(String args[]) {
//        ownersWithNoCars();
//        nameOfPersonAndNumberOfCar();
        carsNotOwned();
    }

}
