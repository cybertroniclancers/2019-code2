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

public class DumpBallCogandCrossLine extends Command {
Timer t;
	public DumpBallCogandCrossLine(){
		requires(Robot.chassisSubsystem);
		requires(Robot.gearReleaseSubsystem);
		requires(Robot.steamGetterSubsystem);
	}
	protected void end() {
		
		
	}

	@Override
	protected void execute() {
		
		if(t.get() < 1.0){
			Robot.gearReleaseSubsystem.Launch(true, false);
			System.out.println("Unloading Steam");
		}
			else if (t.get() >1.0 && t.get() <2.5 ){
			Robot.chassisSubsystem.manDrive(.90);
			System.out.println("Driving to Drop of Gear");
		}
			else if (t.get() > 2.5 && t.get() < 3.0){
			Robot.chassisSubsystem.stopDriving();
			System.out.println("Robot has stopped Driving");
		}
	}

	@Override
	protected void initialize() {
		t = new Timer();
		t.reset();

		t.start();
		System.out.println("Starting autonomous...");	
		
	}



// Make this return true when this Command no longer needs to run execute()
@Override
protected boolean isFinished() {
  return false;

}}