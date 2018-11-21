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

}
