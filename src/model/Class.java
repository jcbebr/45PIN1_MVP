package model;

/**
 *
 * @author José Carlos
 */
public enum Class {
    
    ADJUNTO1("Adjunto 1"),
    ADJUNTO2("Adjunto 2"),
    ASSISTENTE1("Assistente 1"),
    ASSISTENTE2("Assistente 2");
    
    private final String clas;

    private Class(String clas) {
        this.clas = clas;
    }

    @Override
    public String toString() {
        return this.clas;
    }
    
}
