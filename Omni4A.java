package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.RobotMap;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Omni4A {
    
    DcMotor leftFront;
    DcMotor rightFront;
    DcMotor leftRear;
    DcMotor rightRear;

    public Omni4A(HardwareMap hardwareMap) {
        // Initialize motors with their names from RobotMap
        leftFront = hardwareMap.get(DcMotor.class, RobotMap.LEFT_FRONT_NAME);
        rightFront = hardwareMap.get(DcMotor.class, RobotMap.RIGHT_FRONT_NAME);
        leftRear = hardwareMap.get(DcMotor.class, RobotMap.LEFT_REAR_NAME);
        rightRear = hardwareMap.get(DcMotor.class, RobotMap.RIGHT_REAR_NAME);

        // Set motor directions
        rightRear.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.REVERSE);
    }

    public void drive(double x, double y, double rotation) {
        // Omni drive calculations for 4 wheels
        // Assuming wheels are arranged in a 45 degree angle:
        // 4 motors
        
        // Calculate motor powers
        double leftFrontPower = y + x + rotation;
        double rightFrontPower = y - x - rotation;
        double leftRearPower = y - x + rotation;
        double rightRearPower = y + x - rotation; 

        // Normalize wheel powers
        double max = Math.max(Math.max(Math.max(Math.abs(leftFrontPower), Math.abs(rightFrontPower)),
                            Math.abs(leftRearPower)), Math.abs(rightRearPower));
        if (max > 1.0) {
            leftFrontPower /= max;
            rightFrontPower /= max;
            leftRearPower /= max;
            rightRearPower /= max;
        }

        // Set motor powers
        leftFront.setPower(leftFrontPower);
        rightFront.setPower(rightFrontPower);
        leftRear.setPower(leftRearPower);
        rightRear.setPower(rightRearPower);
    }
} 
