public final class CellphoneConnection {

    private CellphoneConnection() {

    }

    public static void main (final String[] args) {

        DataConnection dataConnection = DataConnection.getInstance();

        System.out.println("Se creó la conexión: " + dataConnection);
    }
}

