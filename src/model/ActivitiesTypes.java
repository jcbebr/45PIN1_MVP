package model;

/**
 *
 * @author José Carlos
 */
public enum ActivitiesTypes {

    ENSINO("Ensino"),
    PEDAGOGICA("Pedagógica"),
    ORIENTACAO("Orientação"),
    EXTENSAO("Extensão"),
    ADMINISTRATIVA("Aministrativa"),
    CAPACITACAO("Capacitação"),
    LICENSA("Licensa"),
    COMPLEMENTAR("ComplementaAAAr"),
    PROJETODEENSINO("Projeto de Ensino"),
    PROJETODEPESQUISA("Projeto de Pesquisa");

    private final String activities;
    private static final ActivitiesTypes[] values = ActivitiesTypes.values();
    
    //new String[]{"Ensino", "Pedagógica", "Orientação", "Extenção", "Administrativa", "Capacitação", "Licensa", "Complementar", "Projeto de Ensino", "Projeto de Pesquisa"};
    private ActivitiesTypes(String activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return this.activities;
    }

    public static String[] getStringVetor() {
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }

    public static ActivitiesTypes get(int i) {
        return values[i];
    }

}
