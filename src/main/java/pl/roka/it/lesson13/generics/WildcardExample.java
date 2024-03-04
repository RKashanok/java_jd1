package pl.roka.it.lesson13.generics;

import java.util.List;

public class WildcardExample {

    public static void processNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        list.add(123); // This is allowed because Integer is a subclass of the element type
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3);
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);
        List<Number> numberList = List.of(1, 2.2, 3L);

        // Upper bounded wildcard example: can process lists of Numbers or any subclass
        processNumbers(intList);
        processNumbers(doubleList);
        processNumbers(numberList);

        // Lower bounded wildcard example: can add Integers to lists of any superclass of Integer
        List<Object> objectList = new java.util.ArrayList<>();
        addIntegers(objectList);
        addIntegers(numberList);

        // This will print out the modified lists to show that integers were added
        System.out.println(objectList);
        System.out.println(numberList);
    }

}
