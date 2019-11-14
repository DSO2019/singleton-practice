package com.ITESO.singleton;

/**
 * Created by El Chamuco.
 */
public final class CellConnection {
    /**
     * Cell connection.
     */
    private static CellConnection cellConnection;

    /**
     * private Constructor.
     */
    private CellConnection() {

    };

    /**
     * @return unique instance of CellConnection
     */
    public static CellConnection getCellConnection() {
        if (cellConnection != null) {
           cellConnection = new CellConnection();
        }
        return cellConnection;
    }

}
