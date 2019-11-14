package com.iteso.singleton;

/**
 * Hello world!
 *
 */
public class Cellphone 
{
    String name;
    String number;
    DataConnection dataConnection;

    public Cellphone(){
        this.name = "Cellphone";
        this.number = "3331114000";
        this.dataConnection = DataConnection.getInstance();
    }

    public void initCall(String numberToCall){
        if(this.dataConnection.getState()){
            System.out.print("Calling " + numberToCall);
        }else{
            System.out.print("No data");
        }
    }

    
}
