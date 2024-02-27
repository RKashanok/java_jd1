package pl.roka.it.lesson12.annotation.clazz;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.METHOD;

@Target(value = METHOD)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodTimer {
    String measurementUnit() default "ms";
}
