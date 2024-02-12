package pl.roka.it.lesson7;

import lombok.Data;

@Data
public class Turbine {

    int horsePower;
    int rotationMoment;
    String type;

    public Turbine() {
        this(1000, 1000, "Reactive Turbine");
    }

    public Turbine(String type) {
        this(1000, 1000, type);
    }

    public Turbine(int horsePower, int rotationMoment, String type) {
        this.horsePower = horsePower;
        this.rotationMoment = rotationMoment;
        this.type = type;
    }
}
