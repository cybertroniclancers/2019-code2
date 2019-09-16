/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;



import frc.robot.commands.AutonomousDriveCommand;
import frc.robot.commands.BallIntakeCommand;
import frc.robot.commands.DumpBallCogandCrossLine;
import frc.robot.commands.DumpBallandCrossLine;
import frc.robot.commands.ForwardOnly;
import frc.robot.commands.Launch;
import frc.robot.commands.Piston1;
import frc.robot.commands.Piston3;
import frc.robot.commands.Retract1;
import frc.robot.commands.Retract3;
import frc.robot.commands.ReverseIntakeCommand;
import frc.robot.commands.ReverseLaunch;
import frc.robot.commands.StopMotorCommand;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import frc.robot.RobotMap;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick driveStick;
	public Joystick singleJoystick;
	public Button spareMotor;
	public Button intakeball;
	public Button launchball;
	public Button liftmachine;
	public Button lowermachine;
	public Button stopmachine;
	public Button lifttolimit;
	public Button fullspeed;
	public Button reverseIntake;
	public Button reverseLaunch;
	public Button launch;
	public Button piston1;
	public Button retract1;
	public Button piston3;
	public Button retract3;
	
	
	public OI() {
// IMPORTANT FOR ROBOT DRIVERS!!! This is where if want to change buttons for a command, this is where most of the changing occurs.	
		driveStick = new Joystick(RobotMap.JOYSTICK_1);
		singleJoystick = new Joystick(4);
        spareMotor = new JoystickButton(driveStick, RobotMap.B_BUTTON);
		intakeball = new JoystickButton(driveStick, RobotMap.RIGHT_BUMPER);
		reverseIntake = new JoystickButton(driveStick, RobotMap.LEFT_BUMPER);
		reverseLaunch = new JoystickButton(driveStick, RobotMap.A_BUTTON);
		launch = new JoystickButton(driveStick, RobotMap.BACK_BUTTON);
        piston1 = new JoystickButton(driveStick, RobotMap.X_BUTTON);
		retract1 = new JoystickButton(driveStick, RobotMap.Y_BUTTON);
		piston3 = new JoystickButton(driveStick, RobotMap.RIGHT_STICK_BUTTON);
		retract3 = new JoystickButton(driveStick, RobotMap.LEFT_STICK_BUTTON);

		spareMotor.whileHeld(new StopMotorCommand());
		intakeball.whileHeld(new BallIntakeCommand());
		reverseIntake.whileHeld(new ReverseIntakeCommand());
		reverseLaunch.whileHeld(new ReverseLaunch());
		launch.whileHeld(new Launch());
		piston1.whileHeld(new Piston1());
		retract1.whileHeld(new Retract1());
		piston3.whileHeld(new Piston3());
		retract3.whileHeld(new Retract3());
		
		// List of Test Commands
		
		SmartDashboard.putData("Autonomous Drive Command", new AutonomousDriveCommand());
		SmartDashboard.putData("Forward Only", new ForwardOnly());
        SmartDashboard.putData("Drop Balls off, Gear off", new DumpBallCogandCrossLine());
        SmartDashboard.putData("Drop Balls off, then Base Line", new DumpBallandCrossLine());


		
		
		
	}
   
}

