package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 7:36 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class NetworkConnect {
    public ArrayList connections;
    public String networkName;


    public void clearConnections(){
        connections.clear();
    }

    public void addConnection (Connection connection) {
        connections.add(connection);
    }

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
