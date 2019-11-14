package java.com.mycompany.app;

/**
 * Cellphone class.
 */
public class Cellphone {
    /**
     * Brand.
     */
    private String brand;
    /**
     * Model.
     */
    private String model;
    /**
     * Launch year.
     */
    private int year;
    /**
     * Data connection.
     */
    private DataConnection dataConnection;

    /**
     * Class constructor
     * @param myBrand brand
     * @param myModel model
     * @param launchYear year
     */
    public Cellphone(String myBrand, String myModel, int launchYear) {
        this.brand = myBrand;
        this.model = myModel;
        this.year = launchYear;
        this.dataConnection = DataConnection.getSingletonInstante(this);
    }

    /**
     * Getter for brand.
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Getter for model.
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Getter for year.
     * @return year
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Getter for data connection.
     * @return dataConnection
     */
    public DataConnection getDataConnection() {
        return this.dataConnection;
    }
}
