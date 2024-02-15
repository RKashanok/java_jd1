package pl.roka.it.lesson8.interfaces;

public class LgTvRemote extends TvRemote implements Remote {

    @Override
    public void turnOn() {
        isTurnedOn = !isTurnedOn;
        System.out.println("LG TvRemote turnOn: " + isTurnedOn);
    }

    @Override
    void doSmth() {
        System.out.println("LG TvRemote Doing something");
    }

    @Override
    public String brand() {
        return "LG";
    }
}
