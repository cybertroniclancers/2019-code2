//*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;


import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.DriveCommand;

//import com.sun.tools.classfile.CompilationID_attribute;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/** This is the main system that controls all motor functions related to wheels..
 *
 *	@author BV
 */

public class chassisSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	 
	RobotDrive chassis;
	Victor spareMotor;
	DigitalInput limitSwitch;
	Compressor awesomecompresser;


	
	
	public chassisSubsystem() {
		chassis = new RobotDrive(RobotMap.LEFT_DRIVE, RobotMap.RIGHT_DRIVE);
		spareMotor = new Victor(RobotMap.SPARE_MOTOR);
	
		awesomecompresser = new Compressor();

		
	}
	public void Compressor(){
		//Working compressor implemented in the Robot file
		awesomecompresser.setClosedLoopControl(true);
		}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveCommand());
    }
    
    
    // Code that controls how the drive train speed controllers interact with the joystick.
    
    public void drive(Joystick stick) {
    	// Assigning the right and left set of motors.
    	//Controls maximum speed of drive motors.
    	chassis.setMaxOutput(1);
    	// Testing to see if this works
          	double forwardsvalue = stick.getRawAxis(1);
           	double rotatevalue = -stick.getRawAxis(0);
             Robot.chassisSubsystem.chassis.arcadeDrive(forwardsvalue, rotatevalue);
    }
          //  	Robot.chassisSubsystem.chassis.arcadeDrive(stick);
    
   // public void arcade(Joystick stick)
       

    /**
     * manDrive is a program that is intended to for controlling speeds for autonomous mode.  STILL NEEDS TUNNING.
     *
     * @param val speed of which that car goes. 0 is for stop, -1 is backwards, 1 is forward
     *     
     * @author BV
     */
    public void manDrive(double val)
    {	

    	chassis.drive(val,0);
  
    }
  
	public void stopDriving() {
    	chassis.stopMotor();
    }
    	
    public void jogSpareMotor(double power) {
    	spareMotor.set(power);
    }
    
    public boolean isLimitSwitchPressed() {
    	return limitSwitch.get();
    }
    public void RotateVechicleClockwise(double turn){
    	chassis.setLeftRightMotorOutputs(-1, 1);
    }
    
    public void CustimizingMotorSpeeds(double left, double right){
    	chassis.setLeftRightMotorOutputs(left, right);
    };
       
    public void SetSafety(boolean safety){
        chassis.setSafetyEnabled(safety);
    }

    
    
}


