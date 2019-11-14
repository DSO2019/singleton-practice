package com.mycompany.app;

public class Phone1 extends DataConnection{
	 private static DataConnection uniqueInstance;

	    private Phone1(){
	       phoneName = "Phone1";
	    }
	    public static DataConnection getInstance(){
	        if(uniqueInstance== null){
	            uniqueInstance = new Phone1();
	        }
	        return uniqueInstance;
	    }

	    public static void clearConnection(){
	        uniqueInstance = null;
	    }
}
