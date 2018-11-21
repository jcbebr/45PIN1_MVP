package model;

/**
 *
 * @author José Carlos
 */
public class Teacher {
    
   private String nome;
   private String regime;
   private Activitie[] activities;

    public Teacher(String nome, String regime, Activitie[] activities) {
        this.nome = nome;
        this.regime = regime;
        this.activities = activities;
    }

    public String getNome() {
        return nome;
    }

    public String getRegime() {
        return regime;
    }

    public Activitie[] getActivities() {
        return activities;
    }
   
   
    
}
