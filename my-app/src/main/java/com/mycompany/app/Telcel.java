package java.com.mycompany.app;


import java.util.ArrayList;

public class Telcel {
    private static int LAUNCH_2019 = 2019;
    private static int LAUNCH_2018 = 2018;
    /**
     * Selling celphones.
     */
    private ArrayList cellphones;

    /**
     * Class constructor.
     */
    private Telcel() {
        this.cellphones = new ArrayList();
    }

    /**
     * Main method.
     * @param args for run
     */
    public static void main(String[] args) {
        Cellphone galaxyS9 = new Cellphone("Samsung", "Galasy S9", LAUNCH_2018);
        Cellphone iPhone11 = new Cellphone("Apple", "iPhone 11", LAUNCH_2018);
    }
}
