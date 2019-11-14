package com.mycompany.app;

import java.util.ArrayList;

/**
 * class Network.
 */
public class Network extends NetworkConnect {

    /**
     * networkConnect.
     */
    private static NetworkConnect uniqueInstance;

    /**
     * Network.
     */
    private Network(){
        networkName = "Network 1";
        connections = new ArrayList();
    }

    /**
     * Network Connect.
     * @return uniqueInstance.
     */
    public static NetworkConnect getInstance(){
        if(uniqueInstance== null){
            uniqueInstance = new Network();
        }
        return uniqueInstance;
    }

    /**
     * Clear connection.
     */
    public static void clearConnection(){
        uniqueInstance = null;
    }

}
