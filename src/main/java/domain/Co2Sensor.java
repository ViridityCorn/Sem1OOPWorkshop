package domain;

public class Co2Sensor extends Sensor{
    public double getValue()
    {
        return 42;
    }
    @Override
    public String toString() {
        return "Co2Sensor{" +
                "name=" + getName() + '\'' +
                "value=" + getValue() +
                '}';
    }
}
