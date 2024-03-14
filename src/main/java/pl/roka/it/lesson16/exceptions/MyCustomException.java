package pl.roka.it.lesson16.exceptions;

public class MyCustomException extends Exception {

    public MyCustomException(String s) {
        super(s);
    }

    public MyCustomException(String s, Exception cause) {
        super(s, cause);
    }
}
