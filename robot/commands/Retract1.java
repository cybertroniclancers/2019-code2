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

public class Retract1 extends Command{

	public Retract1() {
		requires(Robot.gearReleaseSubsystem);
	}

	protected void end() {
		// TODO Auto-generated method stub
		
	}


	protected void execute() {
		// TODO Auto-generated method stub
		Robot.gearReleaseSubsystem.Piston1(false, true);
	}


	protected void initialize() {
		// TODO Auto-generated method stub
		
	}
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}


	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
