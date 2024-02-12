package pl.roka.it.lesson8.interfaces;

public class AkaiTvRemote extends TvRemote {
    @Override
    public void turnOn() {
        isTurnedOn = !isTurnedOn;
        System.out.println("AKAI TvRemote turnOn: " + isTurnedOn);
    }

    @Override
    void doSmth() {
        System.out.println("AKAI TvRemote Doing something");

    }
}
