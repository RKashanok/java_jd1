package pl.roka.it.lesson16.exceptions;

import java.util.Scanner;

public class Runner {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyCustomException e) {
            System.out.println("Exception cached: " + e.getLocalizedMessage());
        }
        System.out.println("Program finished");
    }

    public static void method1() throws MyCustomException {
        System.out.println("Method 1");
        divisionMethod();
    }

    public static void divisionMethod() throws MyCustomException {
        System.out.println("Method 2");
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a divider: ");
        int b = sc.nextInt();
        try {
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException ex) {
            System.err.println("Exception cached: " + ex.getLocalizedMessage());
            throw new MyCustomException("Division by zero is not allowed!");
        }
        System.out.println("Result: " + a / b);
    }
}



















