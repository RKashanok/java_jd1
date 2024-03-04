package pl.roka.it.lesson13.generics;

import java.util.Arrays;
import java.util.Objects;

public class BoxUtils {
    public static void printInternalContainer(Box<?> box) {
        Arrays.stream(box.getAll()).forEach(it -> {
            if(it instanceof String) {
                System.out.println("This is String: " + it);
            } else {
                System.out.println("It's not a String: " + it);
            }
        });
    }

    public  static long getBoxOccupiedSlotsNumber(Box<? extends Object> box) {
        return Arrays.stream(box.getAll()).filter(Objects::nonNull).count();
    }
}
