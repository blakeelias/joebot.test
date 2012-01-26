package edu.stuy;

import edu.stuy.Devmode;
import crio.hardware.CRIO;

public class InitTests {
    public static void setUpTests() {
        CRIO.init();
        Devmode.DEV_MODE = true;
    }

    public static void tearDownTests() {
        CRIO.end();
    }
}
