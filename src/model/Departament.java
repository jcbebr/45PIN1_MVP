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

}
