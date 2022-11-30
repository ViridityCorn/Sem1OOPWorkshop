package domain;

import java.util.List;
import java.util.UUID;

public class Building extends Unit {
    private List<Sensor> sensors;
    private List<Actuator> actuators;

    public List<Sensor> getSensors() {
        return sensors;
    }

    public List<Actuator> getActuators() {
        return actuators;
    }

    public UUID addTempSensor(String name)
    {

    }
    public UUID addCo2Sensor(String name)
    {

    }
    public void removeSensor(UUID id)
    {

    }
    public UUID addVentSensor(String name)
    {

    }

    public void removeActuator(UUID id)
    {

    }
}
