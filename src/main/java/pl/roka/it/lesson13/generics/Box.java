package pl.roka.it.lesson13.generics;

import pl.roka.it.lesson10.Car;
import pl.roka.it.lesson8.interfaces.Remote;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class Box<Type> {

    private Object[] myMemoryBox;

    public Box(int size) {
        this.myMemoryBox = new Object[size];
    }

    public void moveTheBox(Box<? super Car> someArg) {

    }

    public void addToBox(Type toAdd) {
        System.out.println("Sum of internal storage: ");
        for (int i = 0; i < myMemoryBox.length; i++) {
            if (myMemoryBox[i] == null) {
                myMemoryBox[i] = toAdd;
                return;
            }
        }
    }

    public Type getFirst() {
        for (int i = 0; i < myMemoryBox.length; i++) {
            if (myMemoryBox[i] != null) {
                Type result = (Type) myMemoryBox[i];
                myMemoryBox[i] = null;
                return result;
            }
        }
        return null;
    }

    public Object[] getAll() {
        return myMemoryBox;
    }

}
