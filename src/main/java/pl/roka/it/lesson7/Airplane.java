package pl.roka.it.lesson7;

import lombok.Data;

import java.time.LocalDate;
import java.util.Objects;

public class Airplane {

    public static int counter = 10;

    protected static final int a = 100;
    protected static int b;

    private String companyOwner;
    private int length = 5;
    private int turbineNum;
    private Turbine turbine;
    private double tankCapacity;
    private LocalDate producedTime;
    private AirplaneType airplaneType;

    public Airplane() {
        this("Boeing", 100);
    }

    public Airplane(String companyOwner, int length) {
        this(companyOwner, length, 0, 0, LocalDate.now());
    }

    public Airplane(String companyOwner, int length, int turbineNum, double tankCapacity, LocalDate producedTime) {
        this.companyOwner = companyOwner;
        this.length = length;
        this.turbineNum = turbineNum;
        this.tankCapacity = tankCapacity;
        this.producedTime = producedTime;
        b = 200;
        this.turbine = new Turbine();
        counter++;
    }

    protected void test() {
        System.out.println("From Airplane");
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getTurbineNum() {
        return turbineNum;
    }

    public void setTurbineNum(int turbineNum) {
        this.turbineNum = turbineNum;
    }

    public Turbine getTurbine() {
        return turbine;
    }

    public void setTurbine(Turbine turbine) {
        this.turbine = turbine;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public LocalDate getProducedTime() {
        return producedTime;
    }

    public void setProducedTime(LocalDate producedTime) {
        this.producedTime = producedTime;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }


    public String takeOff() {
        return "Airplane is flying";
    }

    public String land() {
        return "Airplane is landing";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airplane airplane)) return false;
        return length == airplane.length && turbineNum == airplane.turbineNum && Double.compare(tankCapacity, airplane.tankCapacity) == 0 && Objects.equals(producedTime, airplane.producedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, turbineNum, tankCapacity, producedTime);
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "companyOwner='" + companyOwner + '\'' +
                ", length=" + length +
                ", turbineNum=" + turbineNum +
                ", turbine=" + turbine +
                ", tankCapacity=" + tankCapacity +
                ", producedTime=" + producedTime +
                '}';
    }
}