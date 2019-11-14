package com.mycompany.app;

/** Data connection.*/
public final class DataConnection {

    /** Unique Instance.*/
    private static DataConnection uniqueInstance;

    /** Constructor.*/
    private DataConnection() {
        System.out.println("Conexión con datos móviles");
    }

    /** @return Instance.*/
    public static DataConnection getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new DataConnection();
        } else {
            System.out.println("Ya existe una instacia");
        }
        return uniqueInstance;
    }

    /** Clear connection.*/
    public static void clearConnection() {
        uniqueInstance = null;
    }

}
