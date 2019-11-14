package main.java.mx.iteso.singleton;

/**DataConnection. */
public final class DataConnection {
    /**DataConnection instance. */
    private static DataConnection instance;
    /**Standard ping. */
    private static final int STANDARD_PING = 96;
    /**ping of connection. */
    private int ping;
    /**isConnected. */
    private boolean isConnected;
    /**Constructor. */
    private DataConnection() {
        ping = STANDARD_PING;
        isConnected = true;
    }
    /**get instance of singleton.
     * @return instance.
    */
    public static DataConnection getInstance() {
        if (instance == null) {
            instance = new DataConnection();
        }
        return instance;
    }
    /**clear instance of singleton. */
    public static void clearConnection() {
        instance = null;
    }
    /**get ping.
     * @return ping.
    */
    public int getPing() {
        return ping;
    }
    /**get isConnected.
     * @return isConnected.
    */
    public boolean getIsConnected() {
        return isConnected;
    }
}
