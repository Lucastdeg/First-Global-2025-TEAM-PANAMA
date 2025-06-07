package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Omni3 {
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private DcMotor backMotor;

    public Omni3(HardwareMap hardwareMap) {
        // Initialize motors with their names from RobotMap
        leftMotor = hardwareMap.get(DcMotor.class, RobotMap.LEFT_FRONT_NAME);
        rightMotor = hardwareMap.get(DcMotor.class, RobotMap.RIGHT_FRONT_NAME);
        backMotor = hardwareMap.get(DcMotor.class, RobotMap.LEFT_REAR_NAME);

        // Set motor directions
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    public void drive(double x, double y, double rotation) {
        // Omni drive calculations for 3 wheels
        // Assuming wheels are arranged in a triangle:
        // Left and right wheels at front, one wheel at back
        
        // Calculate motor powers
        double leftPower = y + x + rotation;
        double rightPower = y - x - rotation;
        double backPower = -y + rotation;  // Back wheel only needs to handle y and rotation

        // Normalize wheel powers
        double max = Math.max(Math.max(Math.abs(leftPower), Math.abs(rightPower)),
                            Math.abs(backPower));
        if (max > 1.0) {
            leftPower /= max;
            rightPower /= max;
            backPower /= max;
        }

        // Set motor powers
        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);
        backMotor.setPower(backPower);
    }
} 
