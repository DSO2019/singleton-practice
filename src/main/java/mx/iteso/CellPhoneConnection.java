package main.java.mx.iteso;
/**
 * Cellphone connection class.
 */
public final class CellPhoneConnection {

    /** Connection status variable. */
    private static CellPhoneConnection connection;

    /** Constructor. */
    private CellPhoneConnection() {
     }

    /** Return singleton value.
     * @return Connection status.
     */
    public static CellPhoneConnection getInstance() {
        if (connection == null) {
            connection = new CellPhoneConnection();
        }
        return connection;
    }

}
