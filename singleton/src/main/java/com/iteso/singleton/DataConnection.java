package com.iteso.singleton;

public class DataConnection{

    private static DataConnection uniqueInstance;
    private static boolean state;

    private DataConnection(){
        state = true;
         
    }

    public static DataConnection getInstance(){
        if(uniqueInstance == null){
            uniqueInstance = new DataConnection();
        }
        return uniqueInstance;
    }

    public static boolean getState(){
        return state;
    }


}