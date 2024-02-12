package pl.roka.it.lesson8.interfaces;

import java.util.ArrayList;
import java.util.List;

public interface Remote {

//    public static final List<String> someList = new ArrayList<>();

    void turnOn();
    void turnOff();

    default String brand(){
        return "noname";
    }
}
