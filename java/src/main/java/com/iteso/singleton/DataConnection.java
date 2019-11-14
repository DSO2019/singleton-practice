package com.iteso.singleton;


/**
 * Data connection singleton.
 */
public final class DataConnection {

    /**
     * Private data connection unique instance.
     */
    private static DataConnection uniqueDataConnection;

    /** Priate constructror. */
    private DataConnection() { }

    /**
     * Get instance method.
     * @return private instance.
     */
    public static DataConnection getInstance() {
        if (uniqueDataConnection == null) {
            uniqueDataConnection = new DataConnection();
        }
        return uniqueDataConnection;
    }
}
