package com.mycompany.app;

class CellphoneDataConnection {
     
    private static CellphoneDataConnection instance = null; 
    public String s; 
  
    private CellphoneDataConnection() { 
        s = "Connected."; 
    } 
  
    public static CellphoneDataConnection getInstance() { 
        if (instance == null) 
            instance = new CellphoneDataConnection(); 
        return instance; 
    } 
}
