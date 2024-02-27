package pl.roka.it.lesson12.annotation.clazz;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface ProcessableWithAnnotation {
}
