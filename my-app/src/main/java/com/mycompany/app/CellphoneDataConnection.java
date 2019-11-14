package com.mycompany.app;

/**
 * CellphoneDataConnectionClass.
 *
 */
public final class CellphoneDataConnection {
    /**
    * Unique instance.
    *
    */
    private static CellphoneDataConnection connection;

    /**
    * Private constructor.
    *
    */
    private CellphoneDataConnection() {

    }

    /**
    * Static method to get the single instance.
    *@return Single connection.
    */
    public static CellphoneDataConnection getCellphoneDataConnection() {
        return connection;
    }
}
