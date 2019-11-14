package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	DataConnection dataConnection;
    	
    	dataConnection = Phone1.getInstance();
    	System.out.println(dataConnection.phoneName);
    	
    	
    	dataConnection = Phone2.getInstance();
    	System.out.println(dataConnection.phoneName);

    	
    }
}
