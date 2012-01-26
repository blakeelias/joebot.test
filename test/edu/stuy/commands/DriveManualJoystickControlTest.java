/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy.commands;

import edu.stuy.Devmode;
import crio.hardware.CRIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class DriveManualJoystickControlTest {
    
    public DriveManualJoystickControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        CRIO.init();
        Devmode.DEV_MODE = true;
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        CRIO.end();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testDriveManualJoystickControl() {
        DriveManualJoystickControl cmd = new DriveManualJoystickControl();
        assertFalse(cmd.isFinished());
    }
}
