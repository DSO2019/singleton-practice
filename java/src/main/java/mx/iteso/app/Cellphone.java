package mx.iteso.app;

/**
 * Cellphone class.
 */
public class Cellphone {
    /**
     * Connection method.
     */
    public void getConnection() {
        CellphoneDataConnection cdc = CellphoneDataConnection.getInstance();
        cdc.setExample(cdc.getExample() + "Hello ");
        CellphoneDataConnection newCDC = CellphoneDataConnection.getInstance();
        newCDC.setExample(newCDC.getExample() + "World");
        CellphoneDataConnection exclamationMark
        = CellphoneDataConnection.getInstance();
        exclamationMark.setExample(exclamationMark.getExample() + "!");
        CellphoneDataConnection result = CellphoneDataConnection.getInstance();
        System.out.println(result.getExample());
    }
}
