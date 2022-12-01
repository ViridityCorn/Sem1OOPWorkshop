package domain;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;
    
    public Unit(String name)
    {
        this.name = name;
        this.id = UUID.randomUUID();
    }

    public UUID getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
