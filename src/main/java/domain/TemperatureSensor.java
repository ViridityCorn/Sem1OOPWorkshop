package domain;

public class TemperatureSensor extends Sensor{
    public double getValue()
    {
        return 7;
    }
    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "name=" + getName() + '\'' +
                "value=" + getValue() +
                '}';
    }
}
