package model;

import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author José Carlos
 */
public class Teacher {

    private String name;
    private String regime;
    private ArrayList activities;

    public Teacher() {
        this.activities = new ArrayList();
    }

    public Teacher(String nome, String regime, ArrayList activities) {
        this.name = nome;
        this.regime = regime;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public ArrayList getActivities() {
        return activities;
    }

    public void setActivities(ArrayList activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Teacher{" + "name=" + name + ", regime=" + regime + ", activities=" + activities + '}';
    }


    
    
}
