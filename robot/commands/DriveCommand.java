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
public class DriveCommand extends Command {

	
    public DriveCommand() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.chassisSubsystem);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.chassisSubsystem.Compressor();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.chassisSubsystem.drive(Robot.oi.singleJoystick);
  }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.chassisSubsystem.stopDriving();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.chassisSubsystem.stopDriving();
    }
}
