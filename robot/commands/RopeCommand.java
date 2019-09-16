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

public class RopeCommand extends Command{

	public RopeCommand(){
		requires(Robot.ropeSubsystem);
	}
	@Override
	protected void end() {
		Robot.ropeSubsystem.StopRope();
		
	}

	@Override
	protected void execute() {
		Robot.ropeSubsystem.Ropeup(Robot.oi.driveStick);
		Robot.ropeSubsystem.InsideLift(Robot.oi.driveStick);
		Robot.ropeSubsystem.BallCapture(Robot.oi.driveStick);
		}
		

	@Override
	protected void initialize() {
		
		
	}

	@Override
	protected void interrupted() {
	   Robot.ropeSubsystem.StopRope();
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}
