package com.mycompany.app;


/**
 * Cellphone connection class.
 */
public class Network {


    /**
     *  Network().
     */
    private Network() { }

    /**
     * network connection.
     *
     */
    private static String connection;

    /** Singleton.
     * @return Network.
     */
    public static String getInstance() {
        if(Network.connection == null) {
            Network.connection = "Connected to Network";
        }
        return Network.connection;
    }
}
