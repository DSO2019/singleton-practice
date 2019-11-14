package java.com.mycompany.app;

/**
 * DataConnection class.
 */
public class DataConnection {
    /**
     * Connection status.
     */
    private Boolean connectionActive = false;
    /**
     * Belonging cellphone.
     */
    private Cellphone cellphone;
    /**
     * Private instance.
     */
    private static DataConnection dataConnection;

    /**
     * Class constructor.
     * @param newCellphone cellphone
     */
    private DataConnection(Cellphone newCellphone) {
        this.cellphone = newCellphone;
        this.connectionActive = true;
    }

    /**
     * Getter for singleton instance.
     * @param cellphone belonging cellphone
     * @return dataConnection instance
     */
    public static DataConnection getSingletonInstante(Cellphone cellphone) {
        if (dataConnection == null) {
            dataConnection = new DataConnection(cellphone);
        }
        else {
            System.out.println("There's an active connection 0000already");
        }
        return dataConnection;
    }

    /**
     * Getter for connection status.
     * @return status
     */
    public Boolean getConnection_active() {
        return this.connectionActive;
    }

    /**
     * Setter for connection status.
     * @param state current
     */
    public void setConnection_active(Boolean state) {
        this.connectionActive = state;
    }

    /**
     * Getter for cellphone.
     * @return cellphone
     */
    public Cellphone getCellphone() {
        return this.cellphone;
    }

    /**
     * Cellphone setter.
     * @param myCellphone cellphone
     */
    public void setCellphone(Cellphone myCellphone) {
        this.cellphone = myCellphone;
    }

}
