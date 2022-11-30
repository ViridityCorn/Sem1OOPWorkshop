package domain;

public class TemperatureSensor extends Sensor{
    public double getValue()
    {

    }
    @Override
    public String toString() {
        return "TemperatureSensor{" +
                "name=" + getName() + '\'' +
                "value=" + getValue() +
                '}';
    }
}
