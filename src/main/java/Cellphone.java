/**CellPhone Class.*/
public class Cellphone {
    /**
     * var.
     */
    private String phoneNumber;
    /**
     * variable.
      */
    private DataConnection network;

    /**
     *
     * @param vPhoneNumber .
     * @param vNetwork .
     */
    public Cellphone(final String vPhoneNumber, final DataConnection vNetwork) {
        this.phoneNumber = vPhoneNumber;
        this.network = vNetwork;
    }

    /**
     *
     * @param number .
     * @return .
     */
     public final String call(final String number) {
        return "Marcame ya " + number;
     }

    /**
     * @return .
     */
     public final String connectToNework() {
        return network.connectToNetwork();
     }

    /**
     * @return .
     */
     public final String showSignal() {
        return network.getSignal();
     }
}
