package domain;

public class VentilationActuator extends Actuator{
    @Override
    public void setValue(double value) {
        super.setValue(value);
    }

    @Override
    public String toString() {
        return "VentilationActuator{" +
                "name=" + getName() + '\'' +
                "value=" + value +
                '}';
    }
}
