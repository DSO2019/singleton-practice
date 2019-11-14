package com.iteso;

import com.iteso.singleton.DataConnection;

/**
 * Cellphone class.
 */
public class Cellphone {
    /** Data connection attribute. */
    private DataConnection dataConnection;

    /** Connection method. */
    public void connect() {
        this.dataConnection = DataConnection.getInstance();
    }

    /** Disconnection method. */
    public void disconnect() {
        this.dataConnection = null;
    }

    /** Get connection method.
     * @return connection.
    */
    public String getDataConnection() {
        if (this.dataConnection == null) {
            return "No connection...";
        }
        return "Connected!";
    }
}
