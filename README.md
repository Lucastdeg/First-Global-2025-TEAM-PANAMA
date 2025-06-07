# TEAM PANAMA First Global Challenge Robot Code

This is a modular robot code structure for the First Global Challenge.

In this README you will find the instructions on how to use it, also, feel free to contact me if you need any help lucastdeg@gmail.com

It can be hard to get into robotics, specially if you are new and have no guidance, First Global is a great competition and everyone should contribute so new members can participate!

## Development Setup

1. Install Required Software:
   - Java Development Kit (JDK) 11 or later (although honestly not needed)
   - REV Hardware Client (for hardware configuration)

2. Project Setup:
   - Clone this repository
   - Open the project in your IDE

## Project Structure

- `Robot.java` - Main robot class that handles the robot initialization and control loop
- `Omni4A.java` - Classic old Omni 4 wheel drive (all the motors are angled in this version)
- `Omni4B.java` - A modified Omni 4 wheel drive where wheels are perpendicular to each other (I haven't actually tested this one in real life yet)
- `Omni3.java` - 3 wheel Omni drive, also haven't tested this one, but it should work, just note that two motors are in front and one is back
- `Hang.java` - Hang and Retract, very simple code
- `RobotMap.java` - Contains all hardware configuration constants

Do note that Panama's coding team will be adding more Subsystems
Might add PID as well

## Hardware Configuration

1. Use REV Hardware Client to configure your hardware:
   - Open Configuration in the tablet
   - Configure motors with the following IDs (For Contrul Hub)
     - leftFront: Port 0
     - rightFront: Port 1
     - leftRear: Port 2
     - rightRear: Port 3
   - Hang and other Subsystems go in Expansion Hub

2. Deploy Code:
   - Connect from your computer to your robot by cable or wifi
   - Open OnBotJava
   - Add the files
   - Make sure the package at the top matches the directory
   - Build the project
   - You are ready to go!

## Controls

- Left JoyStick X-axis: Left/Right movement
- Left JoyStick Y-axis: Forward/Backward movement
- Right JoysStick X-axis (rotation): Turning

- Other buttons used for Hang and other Subsystems

## Adding New Subsystems

To add a new subsystem:
1. Create a new class for your subsystem
2. Add its IDs to `RobotMap.java`
3. Create an instance in `Robot.java`
4. Add control logic inside `while (opModeIsActive()) {}` 