package pl.roka.it.lesson9.comparision;

import pl.roka.it.lesson9.interfaces2.Car;

import java.util.*;
import java.util.function.Function;

public class Runner {
    public static void main(String[] args) {

        List<Car> carsList = new ArrayList<>();
        Car car1 = new Car();
        car1.setBrand("Mazda");
        car1.setMileage(99999);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car2.setMileage(983165);

        Car car3 = new Car();
        car3.setBrand("Ford");
        car3.setMileage(789845);

        Car car4 = new Car();
        car4.setBrand("WV");
        car4.setMileage(675443);
        carsList.addAll(Arrays.asList(car1, car2, car3, car4));
        System.out.println(carsList);

//        List<Integer> intList = Arrays.asList(45,3,8,4,54,3,45,23,5,86,34,98);
//        Collections.sort(intList);

        Comparator<Car> carComp = (o1, o2) -> o1.getMileage() - o2.getMileage();

        Collections.sort(carsList, carComp);

        System.out.println(carsList);

    }
}
