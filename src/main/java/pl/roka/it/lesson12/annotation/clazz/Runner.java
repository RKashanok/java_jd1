package pl.roka.it.lesson12.annotation.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws InterruptedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<MobilePhone> clazz = MobilePhone.class;

        if (clazz.isAnnotationPresent(ProcessableWithAnnotation.class)) {
            System.out.println("Annotation present");

            MobilePhone phone = (MobilePhone) clazz.getDeclaredConstructors()[0].newInstance(123123123);
            System.out.println(phone);

            Field number = clazz.getDeclaredField("number");
            number.setAccessible(true);
            number.set(phone, 987987987);
            System.out.println(phone);

            Method[] declaredMethods = clazz.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (method.isAnnotationPresent(MethodTimer.class)) {
                    System.out.println("Method " + method.getName() + " has annotation");
                    MethodTimer annotation = method.getAnnotation(MethodTimer.class);
                    String units = annotation.measurementUnit();
                    System.out.println("Measurement unit: " + units);
                    long start = System.currentTimeMillis();
                    method.invoke(phone);
                    long durationInMs = System.currentTimeMillis() - start;
                    if(units.equals("sec")) {
                        System.out.println("Duration: " + durationInMs / 1000 + " seconds");
                    } else {
                        System.out.println("Duration: " + durationInMs + " ms");
                    }
                } else if (method.getName().equalsIgnoreCase("toggleBlockPhone")) {
                    System.out.println("Method " + method.getName() + " has no annotation");
                    method.setAccessible(true);
                    method.invoke(phone);
                }
            }
            System.out.println(phone);
        } else {
            System.out.println("Annotation not present");
        }

    }

}
