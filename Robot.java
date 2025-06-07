package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;


@TeleOp(name = "FGC_TeleOp", group = "FGC")
public class Robot extends LinearOpMode {
    // Subsystems
    // private Omni3 omni3;  // Commented out 
    // private Omni4B omni4B;  // Commented out 
    private ElapsedTime runtime = new ElapsedTime();
    private Omni4A omni4A;
    private Hang hang;
    
    
    //@Override
    public void runOpMode() {
        // Set up subsystems
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        omni4A = new Omni4A(hardwareMap); // Retrieves motor mappings

        hang = new Hang(hardwareMap); // Retrieves motor mappings
        
        waitForStart();
        runtime.reset();
        
        while (opModeIsActive()) {

            omni4A.drive(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        
            // Hang control
            // I haven't tested this yet
            if (gamepad1.a) {  // A button to extend
                hang.extend();
            } else if (gamepad1.b) {  // B button to retract
                hang.retract();
            } else {
                hang.stop();
            }
    
            // Telemetry
            telemetry.addData("Hang Status", hang.isExtended() ? "Extended" : "Retracted");
            telemetry.update();
        }
        
        
    }

} 
