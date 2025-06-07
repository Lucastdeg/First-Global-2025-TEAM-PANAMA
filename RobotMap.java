package org.firstinspires.ftc.teamcode;

public class RobotMap {
    // Drive Motors
    // This are the names you have to add in configuration
    public static final String LEFT_FRONT_NAME = "leftFront";    // Name for left motor
    public static final String RIGHT_FRONT_NAME = "rightFront";   // Name for right motor
    public static final String LEFT_REAR_NAME = "leftRear";    // Name for left back motor
    public static final String RIGHT_REAR_NAME = "rightRear";   // Name for right back motor
    
    // Hang System
    public static final String HANG_MOTOR_NAME = "hangMotor";    // Name for hang motor
    
    // Add more motors as needed

    // Gamepad Button Mappings
    public static final class Gamepad1 {
        // Drive Controls
        public static final double DRIVE_SPEED = 0.8;  // Max drive speed (80%)
        public static final double TURN_SPEED = 0.6;   // Max turn speed (60%)
        
        // Hang Controls
        public static final boolean HANG_EXTEND_BUTTON = true;    // A button
        public static final boolean HANG_RETRACT_BUTTON = true;   // B button
        public static final double HANG_SPEED = 1.0;              // 50% power
        // I don't actually use these in the code, but you can if you want, just call them
    }

    // Timing Constants
    public static final int HANG_DELAY_MS = 500;      // Delay between hang actions
    public static final int TELEMETRY_UPDATE_MS = 50; // How often to update telemetry
} 
