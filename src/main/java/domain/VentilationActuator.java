package domain;

public class VentilationActuator extends Actuator {
    @Override
    public String toString() {
        return "VentilationActuator{" +
                "name=" + getName() + '\'' +
                "value=" + getValue() +
                '}';
    }
}
