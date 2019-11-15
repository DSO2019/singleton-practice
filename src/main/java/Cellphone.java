public class Cellphone {
    private DataConnection dataConnection;

    public void connect() {
        this.dataConnection = null;
    }

    public void disconnect() {
        this.dataConnection = null;
    }

    public String getDataConnection(){
        if(this.dataConnection == null) {
            return "Error in the connection";
        }
        return "Connection success";
    }

}
