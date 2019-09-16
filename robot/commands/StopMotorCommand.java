/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;



import frc.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StopMotorCommand extends Command {
	
	public StopMotorCommand() {
		
	requires(Robot.chassisSubsystem);
	}

   protected void initialize(){
	   
   }

    // Called just before this Command runs the first time
    protected void execute() {
    	if (Robot.chassisSubsystem.isLimitSwitchPressed()){
    		Robot.chassisSubsystem.jogSpareMotor(0.0);
    	}else{
    		Robot.chassisSubsystem.jogSpareMotor(0.5); }
    }

    // Called repeatedly when this Command is scheduled to run
    protected boolean isFinished(){
    		return false;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected void end(){
    	Robot.chassisSubsystem.jogSpareMotor(0.0);
    }
    
    protected void interrupted(){
    	Robot.chassisSubsystem.jogSpareMotor(0.0);
    	
    }
    	}
    // Called once after isFinished returns true
  
