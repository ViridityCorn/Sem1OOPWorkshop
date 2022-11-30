package domain;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;

    public UUID getId() {
        return id;
    }

    public String getName()
    {

    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
