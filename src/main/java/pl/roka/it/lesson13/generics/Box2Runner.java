package pl.roka.it.lesson13.generics;

import pl.roka.it.lesson10.Car;
import pl.roka.it.lesson10.User;
import pl.roka.it.lesson8.interfaces.AkaiTvRemote;
import pl.roka.it.lesson8.interfaces.LgTvRemote;
import pl.roka.it.lesson8.interfaces.Remote;

import java.util.Arrays;

public class Box2Runner {
    public static void main(String[] args) {

        Box2<Remote> box = new Box2<>();

        box.addToBox(new LgTvRemote());
        box.addToBox(new AkaiTvRemote());

        for (int i = 0; i < box.myBox.length; i++) {
            if (box.myBox[i] != null) {
                box.getFirst().turnOn();
            }
        }


    }


}
