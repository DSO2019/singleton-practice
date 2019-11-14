package com.mycompany.app;

/**
 * Clase para crear una unica instancia de Data.
 */
public final class DataConnection {
    /**
     * La unica instancia.
     */
    private static DataConnection uniqueInstance;

    /**
     * Constructor privado.
     */
    private DataConnection() {
        System.out.println("Crear datos");
    }

    /**
     * Publico de instancia.
     * @return la instancia unica.
     */
    public static DataConnection getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DataConnection();
        }
        return uniqueInstance;

    }
}
