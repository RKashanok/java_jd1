package pl.roka.it.lesson8.interfaces;

public abstract class TvRemote implements Remote {

    protected boolean isTurnedOn = false;
    protected int programNum = 1;

    abstract void doSmth();

    @Override
    public void turnOff() {
        isTurnedOn = !isTurnedOn;
        System.out.println("TvRemote turnOff: " + !isTurnedOn);
    }

    public void switchProgramUp() {
        programNum++;
        System.out.println("Current program: " + programNum);
    }

    public void switchProgramDown() {
        programNum++;
        System.out.println("Current program: " + programNum);
    }

    @Override
    public String toString() {
        return "TvRemote{" +
                "isTurnedOn=" + isTurnedOn +
                ", brand=" + brand() +
                ", program=" + programNum +
                '}';
    }
}
