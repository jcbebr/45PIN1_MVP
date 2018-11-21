package model;

/**
 *
 * @author José Carlos
 */
public enum Center {

    CEAVI("CEAVI");

    private final String center;

    private Center(String center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return this.center;
    }

    public static String[] getStringVetor() {
        Center[] values = Center.values();
        String[] string = new String[values.length];
        for (int i = 0; i < string.length; i++) {
            string[i] = values[i].toString();
        }
        return string;
    }
    
}
