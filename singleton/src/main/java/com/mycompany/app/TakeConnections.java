package com.mycompany.app;

/**
 * class TakeConnections
 */
public class TakeConnections {

    /**
     * main funct.
     * @param args args.
     */
    public static void main(String[] args) {
        NetworkConnect network;
        Connection connection;

        network = Network.getInstance();
        connection = new Connection();
        connection.setName("Connection");
        connection.setPrice(850);
        connection.setNetwork("At&T");
        network.addConnection(connection);

        network.printCheck();
    }


}
