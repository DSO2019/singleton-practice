/**
 * clase .
 */
public final class AtntConnection implements DataConnection {
    /**
     * variable .
      */
    private static AtntConnection instance = null;

    /**
     * const .
     */
    private AtntConnection() { };

    /**
     *
     * @return .
     */
    public static AtntConnection getInstance() {
        if (instance == null) {
            instance = new AtntConnection();
        }
        return instance;
    }

    /**
     *
     * @return .
     */
    @Override
    public String connectToNetwork() {
        return "Conectado a la red movieeestar";
    }
    /**function getSignal.
     * @return String .*/
    @Override
    public String getSignal() {
        return "red movieestar";
    }
}
