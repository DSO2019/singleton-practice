package com.ITESO.singleton;

/**
 * Created by el Chamuco.
 */
public class Cellphone {
    /**
     * CellConnection.
     */
    private CellConnection cellConnection;

    /**
     * Constructor.
     */
    public Cellphone() {
        this.cellConnection = CellConnection.getCellConnection();
    }
}
