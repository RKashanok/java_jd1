package pl.roka.it.lesson10;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@ToString
public class Car implements Cloneable, Serializable, Comparable<Car> {

    transient int year;
    transient String brand;
    transient String model;
    private Engine engine;

    public Car(int year, String brand, String model) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.engine = new Engine(100, "diesel");
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public int compareTo(Car o) {
        return this.year - o.year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Data
    private static class Engine implements Cloneable, Serializable {
        int power;
        String type;

        public Engine(int power, String type) {
            this.power = power;
            this.type = type;
        }
    }
}