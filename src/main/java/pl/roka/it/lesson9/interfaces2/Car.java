package pl.roka.it.lesson9.interfaces2;

import lombok.Data;

import java.time.LocalDate;
import java.util.function.Predicate;

@Data
public class Car {

    LocalDate productionDate;
    String brand;
    String model;
    int mileage;

    boolean isCarGood(Predicate<Car> predicate) {
        return predicate.test(this);
    }

}
