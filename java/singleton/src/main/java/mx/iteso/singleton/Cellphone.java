package main.java.mx.iteso.singleton;
/**cellphone. */
public class Cellphone {
    /**DataConnection. */
    private DataConnection connection;
    /**phone number. */
    private String phoneNumber;

    /**Constructor of cellphone.
     * @param pNumber phone number.
    */
    public Cellphone(final String pNumber) {
        this.phoneNumber = pNumber;
        this.connection = DataConnection.getInstance();
    }
    /**get Phone number.
     * @return phone number.
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    /**@param pNumber number. */
    public void setPhoneNumber(final String pNumber) {
        this.phoneNumber = pNumber;
    }
}
