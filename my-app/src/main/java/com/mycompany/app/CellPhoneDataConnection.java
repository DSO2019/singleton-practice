package com.mycompany.app;


/**
 * Donde se va a probar singleton.
 */
public final class CellPhoneDataConnection {
    /**
     * Tener una clase privada.
     */
    private CellPhoneDataConnection() {

    }

    /**
     * Metodo main.
     * @param args para entrar
     */
    public static void main(final String[] args) {
        DataConnection dataConnection;

        dataConnection = DataConnection.getInstance();
        dataConnection = DataConnection.getInstance();
        dataConnection = DataConnection.getInstance();
        dataConnection = DataConnection.getInstance();

    }
}
