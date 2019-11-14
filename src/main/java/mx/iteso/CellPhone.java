package mx.iteso;
import mx.iteso.CellPhoneConnection;

/** CellPhone class. */
public class CellPhone{

    /** Connection status variable. */
    private String connectionStatus;
    /** Model variable. */
    private String model;

    /** Constructor.
     * @param selectedModel CellPhone model.
     */
    public CellPhone(String selectedModel){
        this.model = selectedModel;
        this.connectionStatus = CellPhoneConnection.getInstance();
    }

    /** Data return string.
     * @return string.
     */
    public String getData(){
        return "Cell Phone: " + this.model + ". Status: " + this.connectionStatus; 
    }

}