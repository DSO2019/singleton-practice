package mx.iteso.app;

/**
 * Cellphone Data Connection.
 *
 */
public final class CellphoneDataConnection {
    /**
     * Example string.
     */
    private String example = "";
    /**
     * Private constructor.
     */
    private CellphoneDataConnection() { };
    /**
     * Instance of the class.
     */
    private static CellphoneDataConnection instance;
    /**
     * Global get instance.
     * @return instance.
     */
    public static CellphoneDataConnection getInstance() {
        if (instance == null) {
            instance = new CellphoneDataConnection();
        }
        return instance;
    }
    /**
     * @return example string.a
     */
    public String getExample() {
        return example;
    }
    /**
     * sets example string.
     * @param ex example.
     */
    public void setExample(final String ex) {
        this.example = ex;
    }
}
