package pl.roka.it.lesson12.annotation.clazz;

import lombok.Data;
import lombok.NonNull;

import java.util.Random;

@Data
@ProcessableWithAnnotation
public class MobilePhone {

    private final Random rand = new Random();

    private String brand;
    private String model;
    private final int number;
    private boolean isBlocked;

    @MethodTimer
    public void callSomeoneAndTalk() throws InterruptedException {
        System.out.println("Calling someone and talking");
        Thread.sleep(rand.nextInt(5000) + 2000);
        System.out.println("Call ended");
    }

    @MethodTimer(measurementUnit = "sec")
    public void callSomeoneAndTalk2() throws InterruptedException {
        System.out.println("Calling someone and talking 2");
        Thread.sleep(rand.nextInt(5000) + 2000);
        System.out.println("Call 2 ended");
    }

    private void toggleBlockPhone() {
        isBlocked = !isBlocked;
    }

}
