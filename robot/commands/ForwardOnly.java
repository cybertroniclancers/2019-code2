/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;



import frc.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;


public class ForwardOnly extends Command {
	Timer t;
	public ForwardOnly(){
		// Use requires() here to declare subsystem dependencies
		requires(Robot.chassisSubsystem);


	}

	@Override
	protected void initialize() {
		t = new Timer();
		t.reset();

		t.start();
		System.out.println("Starting autonomous...");
	}

	@Override
	protected void execute() {

		if(t.get() < 0.4){
			Robot.chassisSubsystem.manDrive(0.9);
		}
			else if (t.get() > 5.0){
				Robot.chassisSubsystem.manDrive(0);
			
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {


	}

	@Override
	protected void interrupted() {


	}

}
