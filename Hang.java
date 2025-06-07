package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hang {
    private DcMotor hangMotor;
    private boolean isExtended;

    public Hang(HardwareMap hardwareMap) {
        // Initialize the hang motor using name from RobotMap
        hangMotor = hardwareMap.get(DcMotor.class, RobotMap.HANG_MOTOR_NAME);
        isExtended = false;
    }

    public void extend() {
        // Extend the hang mechanism
        hangMotor.setPower(0.5);  // 50% power
        isExtended = true;
    }

    public void retract() {
        // Retract the hang mechanism
        hangMotor.setPower(-0.5);  // -50% power
        isExtended = false;
    }

    public void stop() {
        // Stop the hang mechanism
        hangMotor.setPower(0);
    }

    public boolean isExtended() {
        return isExtended;
    }
} 
