package mx.iteso;

/**
 * Cellphone connection class.
 */
public class CellPhoneConnection {

    /** Connection status variable. */
    private static String connection;

    /** Constructor. */
    private CellPhoneConnection() { }

    /** Return singleton value.
     * @return Connection status.
     */
    public static String getInstance() {
        if(CellPhoneConnection.connection == null) {
            CellPhoneConnection.connection = "Connected to 192.168.0.1";
        }
        return CellPhoneConnection.connection;
    }
    
}
