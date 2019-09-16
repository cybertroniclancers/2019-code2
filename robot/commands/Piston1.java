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

public class Piston1 extends Command {

	public Piston1(){
		requires(Robot.gearReleaseSubsystem);
	}

	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
    Robot.gearReleaseSubsystem.Piston1(true, false);

	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
