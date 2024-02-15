package pl.roka.it.lesson9.interfaces2;

public class VasyaAutoChecker implements AutoChecker {

    @Override
    public String checkAuto(Car car) {
        if (car.getMileage() < 100000) {
            return "Vasya: Good car";
        } else {
            return "Bad car";
        }
    }
}
