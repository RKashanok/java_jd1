package pl.roka.it.lesson15;

import pl.roka.it.lesson10.Car;
import pl.roka.it.lesson10.User;

import java.util.*;
import java.util.function.BiConsumer;

public class MyHashSet<K> extends HashMap<K, Object> {

    private final static Object mock = new Object();

    public Object put(K key) {
        return super.put(key, mock);
    }

    @Override
    public Object get(Object key) {
        return super.get(key);
    }

    public static void main(String[] args) {

//        Map<Object, Object> carsMap = new HashMap<>();
//        carsMap.put(new User("Vasya"), mock);
//        carsMap.put(new User("Petya"), mock);
//        carsMap.put(new User("Jane"), mock);
//        carsMap.put(new User("Pasha"), mock);
//        carsMap.put(new Car(2000, "BMW", "525"), mock);
//        carsMap.put("Something new", mock);
//        carsMap.put("Something new2", mock);
//
//        Set<Object> keys = carsMap.keySet();
//        keys.forEach((k) -> System.out.println(k));
//
//        System.out.println("****");
//
//        Collection<Object> values = carsMap.values();
//        values.forEach((v) -> System.out.println(v));
//
//        System.out.println("****");
//
//        Set<Entry<Object, Object>> entries = carsMap.entrySet();
//        Iterator<Entry<Object, Object>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Entry<Object, Object> next = iterator.next();
//            System.out.println(next.getKey() + " == " + next.getValue());
//        }


//        carsMap.forEach(new BiConsumer<Object, Object>() {
//            @Override
//            public void accept(Object key, Object value) {
//                System.out.println(key + " == " + value);
//            }
//        });


//        System.out.println(carsMap);
    }
}
