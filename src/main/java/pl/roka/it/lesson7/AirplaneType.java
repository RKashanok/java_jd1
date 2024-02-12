package pl.roka.it.lesson7;

public enum AirplaneType {

    AIRBUS("Airbus air transport", true),
    BOEING("Boeing air transport", true),
    CESSNA("Cessna air transport", false),
    MILITARY("Military air transport", true),
    BIPLANE("Biplane air transport", false);

    private String name;
    private boolean isModern;

    private AirplaneType(String name, boolean isModern) {
        this.name = name;
        this.isModern = isModern;
    }

    public String getName() {
        return name;
    }

    public boolean isModern() {
        return isModern;
    }

    @Override
    public String toString() {
        return "AirplaneType{" +
                "name='" + name + '\'' +
                ", isModern=" + isModern +
                '}';
    }

    public AirplaneType getTypeByName(String suggestedName) {
        AirplaneType[] values = AirplaneType.values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].name.toLowerCase().contains(suggestedName.toLowerCase())) {
                return values[i];
            }
        }
        return null;
    }

}
