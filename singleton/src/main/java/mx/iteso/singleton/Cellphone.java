package mx.iteso.singleton;

class Cellphone {
    private DataConnection connection;
    private String number;
    Cellphone(String nNumber) {
        this.connection = DataConnection.getInstance();
        this.number = nNumber;
    }

    DataConnection getConnection() {
        return this.connection;
    }

    String getNumber() {
        return number;
    }
}
