package main.java.mx.iteso;
import mx.iteso.CellPhoneConnection;

/** CellPhone class. */
public class CellPhone {

    /** Connection status . */
    private String connectionStatus;
    /** Model variable. */
    private String model;

    /**
     * @param selectedModel CellPhone model.
     */
    public CellPhone(final String selectedModel) {
        this.model = selectedModel;
        this.connectionStatus = CellPhoneConnection.getInstance();
    }

    /**
     * @return string.
     */
    public String getData() {
        return "Cell Phone: " + this.model
        + " Status: " + this.connectionStatus;
    }

}
