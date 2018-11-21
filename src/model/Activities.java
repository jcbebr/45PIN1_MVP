package model;

/**
 *
 * @author José Carlos
 */
public enum Activities {

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

    //new String[]{"Ensino", "Pedagógica", "Orientação", "Extenção", "Administrativa", "Capacitação", "Licensa", "Complementar", "Projeto de Ensino", "Projeto de Pesquisa"};
    private Activities(String activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return this.activities;
    }

    public static String[] getStringVetor() {
        Activities[] values = Activities.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }

}
