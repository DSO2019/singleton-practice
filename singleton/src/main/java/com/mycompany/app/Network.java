package com.mycompany.app;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 10/6/13
 * Time: 8:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Network extends NetworkConnect {

    private static NetworkConnect uniqueInstance;

    private Network(){
        networkName = "Network 1";
        connections = new ArrayList();
    }
    public static NetworkConnect getInstance(){
        if(uniqueInstance== null){
            uniqueInstance = new Network();
        }
        return uniqueInstance;
    }

    public static void clearConnection(){
        uniqueInstance = null;
    }

}
