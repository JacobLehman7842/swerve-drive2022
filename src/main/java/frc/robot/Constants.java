// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static class DriveTrain{
        public static final int DRIVE_DIO_ENCODER1 = 0;
        public static final int DRIVE_DIO_ENCODER2 = 1;
        public static final double DRIVE_LENGTH = 0.5588; //meters
        public static final double DRIVE_WIDTH = 0.508; //meters
        public static final Translation2d[] motorPositions = {
            new Translation2d(-DRIVE_WIDTH/2.0, DRIVE_LENGTH/2.0),
            new Translation2d(-DRIVE_WIDTH/2.0, -DRIVE_LENGTH/2.0), 
            new Translation2d(DRIVE_WIDTH/2.0, DRIVE_LENGTH/2.0), 
            new Translation2d(DRIVE_WIDTH/2.0, -DRIVE_LENGTH/2.0)
        };
        public static final int DRIVE_PWM_LEFT1 = 0;
        public static final int DRIVE_PWM_LEFT2 = 1;
        public static final int DRIVE_PWM_RIGHT1 = 2;
        public static final int DRIVE_PWM_RIGHT2 = 3;
        public static final int DRIVE_PWM_ROTATE = 4;
        public static final double ROTATE_SPEED_MODIFY = 0.5;
        public static final double MOTOR_SPEED_MODIFY = 0.5;
    }
    public static class Controls{

        public static final int CONTROLS_USB_JOYSTICK = 0;
        public static final int BUTTON_FORWARD = 1;

    }
}
