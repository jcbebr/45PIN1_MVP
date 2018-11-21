package model;

/**
 *
 * @author José Carlos
 */
public enum Departament {

    DCIV("DCIV"),
    DESO("DESO"),
    BCC("BCC");

    private final String dpto;

    private Departament(String dpto) {
        this.dpto = dpto;
    }
    
    public static String[] getStringVetor() {
        Departament[] values = Departament.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }

}
