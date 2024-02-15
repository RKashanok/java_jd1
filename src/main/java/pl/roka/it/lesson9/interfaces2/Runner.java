package pl.roka.it.lesson9.interfaces2;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Mazda");
        car1.setMileage(99999);

        Car car2 = new Car();
        car2.setBrand("Audi");
        car1.setMileage(99999);

//        AutoChecker autoChecker1 = new VasyaAutoChecker();
        AutoChecker autoChecker2 = new AutoChecker() {
            @Override
            public String checkAuto(Car car) {
                if (car.getMileage() < 100000) {
                    return "Anonimus class: Good car";
                } else {
                    return "Bad car";
                }
            }
        };
//
//        AutoChecker autoChecker3 = (Car car) -> {
//            if (car.getMileage() < 100000) {
//                return "Lambda: Good car";
//            } else {
//                return "Bad car";
//            }
//        };
//
//        AutoChecker autoChecker4 = (car) -> {
//            if (car.getMileage() < 100000) {
//                return "Lambda 2: Good car";
//            } else {
//                return "Bad car";
//            }
//        };
//
//        AutoChecker autoChecker5 = (car) -> (car.getMileage() < 100000) ? "Lambda 3: Good car" : "Bad car";

//        System.out.println(autoChecker1.checkAuto(car1));
//        System.out.println(autoChecker2.checkAuto(car1));
//        System.out.println(autoChecker3.checkAuto(car1));
//        System.out.println(autoChecker4.checkAuto(car1));
//        System.out.println(autoChecker5.checkAuto(car1));

        Predicate<Car> isGoodCarPredicate = (car) -> car.getMileage() < 100_000;
        Predicate<Car> isGoodCarPredicate2 = (car) -> car.getMileage() < 100_000 && car.getBrand().equalsIgnoreCase("Audi");

        System.out.println(car1.isCarGood(isGoodCarPredicate));
        System.out.println(car1.isCarGood(isGoodCarPredicate2));


    }
}
