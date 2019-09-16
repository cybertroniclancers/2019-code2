/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    


	private static final int _5 = 5;

	private static final int INT = _5;

	private static final int _1 = 1;

	public static int leftMotor = 1;
    
	public static int rightMotor = 5;
    
     //If you are using multiple modules, make sure to define both the                      z
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	public static int JOYSTICK_1 = 1;
	
	public static int JOYSTICK_2 = 2;
	
	public static int A_BUTTON = 1;
	
	public static int B_BUTTON = 2;
	// ^^^ stop motor command
	
	public static int X_BUTTON = 3;
	// ^^^ Gear capture command
	
	public static int Y_BUTTON = 4;
	
	public static int LEFT_BUMPER = 5;
	public static int RIGHT_BUMPER = 6;
	public static int BACK_BUTTON = 7;
	public static int START_BUTTON = 8;
	public static int LEFT_STICK_BUTTON = 9;
	public static int RIGHT_STICK_BUTTON = 10;
	

	public static int LEFT_STICK_Y_AXIS=1;
	public static int RIGHT_STICK_Y_AXIS=5;
	// edit 
	public static int LEFT_TRIGGER = 2;
	public static int RIGHT_TRIGGER = 3;
	
	public static int SPARE_LIMIT_SWITCH = 16;
	public static int LIFT_LIMIT_SWITCH = 0;
	
	//Short Cut for PWM port #'s
	
	public static int LEFT_DRIVE = 2;
	public static int RIGHT_DRIVE = 1;

	
	public static int SPARE_MOTOR = 6;
	
	//Short Cut for PCM port #
	
	
	public static int PISTON_1 = 1;
	public static int RETRACT_1 = 0;
	public static int PISTON_2 = 3;
	public static int RETRACT_2 = 2;
	public static  int PISTON_3 = 5;
	public static  int RETRACT_3 = 4;
	public static  int PISTON_4 = 7;
	public static  int RETRACT_4 = 6;
	

	}
