package model;

/**
 *
 * @author José Carlos
 */
public class Activitie {
    
    private String name;
    private ActivitiesTypes type;
    private float hours;

    public Activitie(String name, ActivitiesTypes type, float hours) {
        this.name = name;
        this.type = type;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public ActivitiesTypes getType() {
        return type;
    }

    public float getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return "Activitie{" + "name=" + name + ", type=" + type + ", hours=" + hours + '}';
    }
    
    
    
}
