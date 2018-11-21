package model;

/**
 *
 * @author José Carlos
 */
public enum Clas {
    
    ADJUNTO1("Adjunto 1"),
    ADJUNTO2("Adjunto 2"),
    ASSISTENTE1("Assistente 1"),
    ASSISTENTE2("Assistente 2");
    
    private final String clas;

    private Clas(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return this.clas;
    }
    
    public static String[] getStringVetor() {
        Clas[] values = Clas.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }
    
}
