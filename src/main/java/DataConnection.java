public class DataConnection {

    private static DataConnection dataConnection;

    private DataConnection() { }

    public static DataConnection getInstance() {
        if (dataConnection == null){
            dataConnection = new DataConnection();
        }
        return dataConnection;
    }

}
