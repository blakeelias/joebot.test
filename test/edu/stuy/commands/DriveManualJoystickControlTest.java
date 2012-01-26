/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stuy.commands;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.stuy.*;
import edu.wpi.first.wpilibj.*;
import crio.hardware.*;

/**
 *
 * @author admin
 */
public class DriveManualJoystickControlTest {
    
    public DriveManualJoystickControlTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        InitTests.setUpTests();
        JoeBot j = new JoeBot();
        j.robotInit();

        // "Drive" the joysticks
        Joystick.setStickAxis(RobotMap.LEFT_JOYSTICK_PORT, 1, -1);
        Joystick.setStickAxis(RobotMap.RIGHT_JOYSTICK_PORT, 1, -1);
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        InitTests.tearDownTests();

        // "un-drive" the joysticks
        Joystick.setStickAxis(RobotMap.LEFT_JOYSTICK_PORT, 1, 0);
        Joystick.setStickAxis(RobotMap.RIGHT_JOYSTICK_PORT, 1, 0);
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
        cmd.initialize();
        double startTime = Timer.getFPGATimestamp();
        while (Timer.getFPGATimestamp() - startTime < 5) {
            cmd.execute();
        }
        cmd.end();

        // TODO: get encoder readings from drivetrain object
        System.out.println(CRIO.client.getdata()[1] + " " + CRIO.client.getdata()[2]);
        assertTrue(CRIO.client.getdata()[1] > 0);
        assertTrue(CRIO.client.getdata()[2] > 0);
    }
}
