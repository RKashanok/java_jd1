package pl.roka.it.lesson10;

import java.io.Serializable;
import java.util.Objects;

public final class User implements Cloneable, Serializable {

    private String name;
    private Car car;



    public User(String name) {
        this.name = name;
    }

    public User(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public User (User original) throws CloneNotSupportedException {
//        this(original.name, new Car(original.car.year, original.car.brand, original.car.model));
        this(original.name, (Car)original.car.clone());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.setCar(new Car(this.car.year, this.car.brand, this.car.model));
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return 42;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "car='" + car + '\'' +
                '}';
    }
}
