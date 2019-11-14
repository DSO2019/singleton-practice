package com.mycompany.app;

public class NokiaCellphone {
    
    public static void main(String args[]) { 
        CellphoneDataConnection cdc = CellphoneDataConnection.getInstance();
        if(cdc != null) {
            System.out.println("Connected");
        } else {
            System.out.println("Failed.");
        }
    } 
  
} 