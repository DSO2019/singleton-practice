package com.mycompany.app;

import java.util.ArrayList;

/**
 * abstract class networkConnect.
 */
public abstract class NetworkConnect {
    /**
     * Connections.
     */
    public ArrayList connections;
    /**
     * networkName.
     */
    public String networkName;


    /**
     * clear connections.
     */
    public void clearConnections(){
        connections.clear();
    }

    /**
     * add Connection.
     * @param connection connection.
     */
    public void addConnection (Connection connection) {
        connections.add(connection);
    }

    /**
     * Print connection check.
     */
    public void printCheck(){
        float total = 0;
        Connection cn;
        int i;
        System.out.println("Check for " + networkName);
        System.out.println("Connections:");
        for (i = 0; i < connections.size(); i++){
            cn = (Connection) connections.get(i);
            System.out.println(cn.getNetwork() + ": " + cn.getName()+ " " + cn.getPrice());
            total += cn.getPrice();
        }
        System.out.println("Total: $" + total);

    }


}
