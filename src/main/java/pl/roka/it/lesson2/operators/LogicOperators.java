package pl.roka.it.lesson2.operators;

import java.util.Random;

public class LogicOperators {
    private static Random ran = new Random();

    public static void main(String[] args) throws InterruptedException {
        // && || ! & |
        int age = 18;

//        if, switch

        if(age >= 18 | test1() | test2() | test3()) {
            System.out.println("inside code block");
        }
    }

    public static boolean test1() throws InterruptedException {
        boolean res = ran.nextBoolean();
        Thread.sleep(1000 + ran.nextInt(4000));
        System.out.println("test1 result = " + res);
        return res;
    }
    public static boolean test2() throws InterruptedException {
        boolean res =  ran.nextBoolean();
        Thread.sleep(1000 + ran.nextInt(4000));
        System.out.println("test2 result = " + res);
        return res;
    }
    public static boolean test3() throws InterruptedException {
        boolean res =  ran.nextBoolean();
        Thread.sleep(1000 + ran.nextInt(4000));
        System.out.println("test2 result = " + res);
        return res;
    }

    // Comparision operators
    // > < >= <= == !=
}
