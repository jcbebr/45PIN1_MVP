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

}
