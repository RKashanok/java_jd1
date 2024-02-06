package pl.roka.it.lesson6.usermodel;

public final class User {

    private String name;

    private static int counter = 0;

    public User() {
        super();
        this.name = "";
    }

    public User(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        counter++;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    @Override public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
} //plain old java object
