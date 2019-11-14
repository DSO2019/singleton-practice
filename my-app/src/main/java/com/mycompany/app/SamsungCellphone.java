package com.mycompany.app;

/**
* Samsung class.
*
*/
public class SamsungCellphone {

    /**
    * Connection to be single.
    *
    */
    private CellphoneDataConnection connection;

    /**
    * Method to establish conneciton.
    *@return Connection status.
    */
    public String connect() {
        this.connection = CellphoneDataConnection.getCellphoneDataConnection();
        if (this.connection != null) {
            return "Connection successful";
        } else {
            return "Connection failed";
        }
    }
}
