package model;

/**
 *
 * @author José Carlos
 */
public enum Category {

    EFETIVO("Efetivo"),
    SUBSTITUTO("Substituto");

    private final String category;

    private Category(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return this.category;
    }

}
