package pl.roka.it.lesson2;

import java.util.Scanner;

public class IfElseIfOperators {

    public static void main(String ... args) {
        // java IfElseIfOperators [18 Roma qwert 123]
        //                          0   1    2    3
        String name = args[0];
        String validator = "Roman";

        System.out.println("Enter month number: ");
        int a = new Scanner(System.in).nextInt();
        if(a >=3 && a <= 5) {
            System.out.println("Весна");
        } else if(a >= 6 && a <= 8) {
            System.out.println("Лето");
        } else if(a >= 9 && a <= 11) {
            System.out.println("Осень");
        } else if(a == 12 || a == 1 || a == 2) {
            System.out.println("Зима");
        } else {
            System.out.println("Неизвестный месяц");
        }


//        if(name.equals(validator) || name.equals("Roma")) {
//            System.out.println("Привет, Рома!");
//            if(5 > 3) {
//                System.out.println("5 больше 3");
//            } else {
//                System.out.println("5 не больше 3");
//            }
//        } else if (name.charAt(0) != 'R') {
//            System.out.println("Привет, НЕ Рома!");
//        } else {
//            System.out.println("Привет фантом!");
//        }


    }
}
