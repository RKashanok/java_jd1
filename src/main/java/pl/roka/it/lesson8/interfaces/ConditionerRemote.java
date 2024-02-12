package pl.roka.it.lesson8.interfaces;

public abstract class ConditionerRemote implements Remote {

    protected boolean isTurnedOn = false;

    @Override
    public void turnOn() {
        isTurnedOn = !isTurnedOn;
        System.out.println("ConditionerRemote turnOn: " + isTurnedOn);
    }

    @Override
    public void turnOff() {
        isTurnedOn = !isTurnedOn;
        System.out.println("ConditionerRemote turnOff: " + !isTurnedOn);
    }

    @Override
    public String toString() {
        return "ConditionerRemote{" +
                "isTurnedOn=" + isTurnedOn +
                ", brand=" + brand() +
                '}';
    }
}
