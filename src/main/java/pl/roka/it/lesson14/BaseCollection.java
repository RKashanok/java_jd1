package pl.roka.it.lesson14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BaseCollection {

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
//        List<Integer> ints2 = new LinkedList<>();
//        List<Integer> ints3 = new Vector<>();
//        List<Integer> ints4 = new Stack<>();

        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);

        List<Integer> integers = Collections.unmodifiableList(ints);
        integers.add(10);


//        for (int i = 0; i < ints.size(); i++) {
//            if (i == 2) {
//                ints.remove(i);
//            }
//            System.out.println(ints.get(i));
//        }

//        Iterator<Integer> iterator = ints.iterator();
//        while (iterator.hasNext()) {
//            Integer next = iterator.next();
//            if (next == 7) {
//                iterator.remove();
//            }
//            System.out.println(next);
//        }

//        for(Integer i : ints) {
//            if (i == 7) {
//                ints.remove(i);
//            }
//            System.out.println(i);
//        }

//        ints.forEach( v -> {
//            if (v == 7) {
//                ints.remove(v);
//            }
//            System.out.println(v);
//        });


//
//        ints2.add(5);
//        ints2.add(6);
//        ints2.add(7);
//        ints2.add(8);
//        ints2.add(9);
//        ints2.add(2, 10);
//
//        System.out.println(ints);
//        System.out.println(ints2);
//
//        System.out.println(ints.size());
//        System.out.println(ints2.size());
//
//        System.out.println(ints.contains(6));
//        System.out.println(ints2.contains(7));

//        Set <Car> set1 = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            int i1 = new Random().nextInt(10) + 14;
//            set1.add(new Car(2000 + i, "Suzuki", "swift"));
//        }
//
//        set1.add(new Car(2002, "Suzuki", "swift"));
//
//        System.out.println(set1);

//        Set<String> stringSet = new HashSet<>();
//        for (int i = 0; i < 10; i++) {
//            String s = UUID.randomUUID().toString();
//            stringSet.add(s);
//            System.out.println(s);
//        }
//
//        stringSet.forEach(System.out::println);
//
//        System.out.println();

//        stringSet.iterator().forEachRemaining(System.out::println);

//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        queue.add("1");
//        queue.add("2");
//        queue.add("3");
//
//        System.out.println(queue);
//
//        System.out.println(queue.poll());
//        System.out.println(queue);
//        System.out.println(queue.peek());
//        System.out.println(queue);
//        queue.offer("4");
//        System.out.println(queue);
//        queue.offer("5");
//        System.out.println(queue);


//        Map<String, Object> cars = new HashMap();
//        Car car = new Car(2000, "Suzuki", "swift");
//        Object mutex = new Object();
//
//        for (int i = 0; i < 3; i++) {
//            cars.put(UUID.randomUUID().toString(), mutex);
//        }
//
//        cars.put(UUID.randomUUID().toString(), mutex);
//        cars.put(UUID.randomUUID().toString(), mutex);
//
//        cars.forEach((k,v) -> System.out.println(v));

    }

}





























