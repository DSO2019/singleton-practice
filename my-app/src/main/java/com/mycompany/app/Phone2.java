package com.mycompany.app;

public class Phone2 extends DataConnection{
	 private static DataConnection uniqueInstance;

	    private Phone2(){
	       phoneName = "Phone2";
	    }
	    public static DataConnection getInstance(){
	        if(uniqueInstance== null){
	            uniqueInstance = new Phone2();
	        }
	        return uniqueInstance;
	    }

	    public static void clearConnection(){
	        uniqueInstance = null;
	    }
}
