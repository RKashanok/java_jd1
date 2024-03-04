package pl.roka.it.lesson13.generics;

import lombok.ToString;

@ToString
public class Box2<T> {

    public Object[] myBox;

    public Box2() {
        this.myBox = new Object[10];
    }

    public void addToBox(T toAdd) {
        for (int i = 0; i < myBox.length; i++) {
            if (myBox[i] == null) {
                myBox[i] = toAdd;
                return;
            }
        }
    }

    public T getFirst() {
        for (int i = 0; i < myBox.length; i++) {
            if (myBox[i] != null) {
                T result = (T) myBox[i];
                myBox[i] = null;
                return result;
            }
        }
        return null;
    }
}
