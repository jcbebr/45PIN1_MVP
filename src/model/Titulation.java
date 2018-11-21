package model;

/**
 *
 * @author José Carlos
 */
public enum Titulation {

    BACHAREL("Bachharel"),
    MESTRE("Mestre"),
    DOUTOR("Doutor");

    private final String titulation;

    private Titulation(String titulation) {
        this.titulation = titulation;
    }

    @Override
    public String toString() {
        return this.titulation;
    }
    
    public static String[] getStringVetor() {
        Titulation[] values = Titulation.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }

}
