
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

public class BallIntakeCommand extends Command{

	public BallIntakeCommand() {
		requires(Robot.steamGetterSubsystem);
	}
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.steamGetterSubsystem.StopIntake();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.steamGetterSubsystem.BallIntake(Robot.oi.singleJoystick);
		System.out.println(Robot.oi.singleJoystick.getRawAxis(3));
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		Robot.steamGetterSubsystem.StopIntake();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
