package mx.iteso.singleton;

class DataConnection {
    static private boolean isActive = false;
    static private DataConnection singleton = null;
    private DataConnection() {
            isActive = true;
    }
    static DataConnection getInstance() {
        if (singleton == null && !isActive) {
            return new DataConnection();
        }
        return singleton;
    }
    boolean getConnectionStatus() {
        return isActive;
    }
}
