package domain;

public abstract class Actuator extends Unit {
    private double value;

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
