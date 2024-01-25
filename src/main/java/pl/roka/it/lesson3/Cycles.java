package pl.roka.it.lesson3;

import java.util.Random;

public class Cycles {

    static boolean isActive = true;

    public static void main(String[] args) throws InterruptedException {

        //for
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Hello world! " + i);
//        }

        for (int i = 0; i < 3; i++) {
            System.out.println("i: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.print("j:" + j + " ");
                for (int k = 0; k < 3; k++) {
                    if(k == 1) {
                        continue;
                    }
                    System.out.print("k: " + k);
                }
            }
            System.out.println();
        }


        //while
//        greetMe();
//        Thread.sleep(2000  + new Random().nextInt(5000));
//        isActive = false;
//        System.out.println("Program finished!");
    }


    public static void greetMe() {
        new Thread(() -> {


            while(isActive) {
                System.out.println("Hello world! ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        }).start();
    }
}
