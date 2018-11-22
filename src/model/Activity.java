package model;

/**
 *
 * @author José Carlos
 */
public class Activity {
    
    private String name;
    private String type;
    private String hours;

    public Activity(String name, String type, String hours) {
        this.name = name;
        this.type = type;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getHours() {
        return hours;
    }

    @Override
    public String toString() {
        return name + " - " + type + " - " + hours + 'h';
    }
    
    
    
}
