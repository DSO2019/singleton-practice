package com.mycompany.app;

/**
 * Class cellphone
 */
public class CellPhone {


    /**
     * Model variable.
     */
    private String samsung;


    /**
     * Connection status variable.
     */
    private String connection;

    /** Cellphone().
     * @param Model samsung.
     */
    public CellPhone(String Model){
        this.samsung = Model;
        this.connection = Network.getInstance();
    }

    /**
     * Connection String.
     * @return string.
     */
    public String getNet(){
        return "Phone: " + this.samsung + ". Status: " + this.connection;
    }


}
