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

    public static String[] getStringVetor() {
        Category[] values = Category.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }
    
}
