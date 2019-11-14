public final class DataConnection {


    private static DataConnection uniqueInstance;


    private DataConnection(){
    }

    public static DataConnection getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new DataConnection();
        }
        return uniqueInstance;
    }
}

