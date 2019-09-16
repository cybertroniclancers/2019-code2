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

public class DumpBallandCrossLine extends Command {
Timer t;
	public DumpBallandCrossLine(){
		requires(Robot.chassisSubsystem);
		requires(Robot.gearReleaseSubsystem);
		requires(Robot.steamGetterSubsystem);
	}
	protected void end() {
		
		
	}

	@Override
	protected void execute() {
		
		if(t.get()> 5.0 && t.get() < 10.0){
			Robot.gearReleaseSubsystem.Launch(false, true);
			System.out.println("Unloading Steam");
		}
			else if (t.get() >10.0 && t.get() < 10.5)
		 {
//			Robot.chassisSubsystem.CustimizingMotorSpeeds(-.7, -.8);
//          Robot.chassisSubsystem.manDrive(-.8);
			System.out.println("Driving in Curved Motion");
	        Robot.chassisSubsystem.CustimizingMotorSpeeds(-.8, -.7);
		}
	        
			else if (t.get() > 10.5 && t.get() < 11.0)
		{
			Robot.chassisSubsystem.stopDriving();
			System.out.println("Robot has stopped in Autonomous");
		}
			else if (t.get() > 11.0 && t.get() < 11.5)
			{ 
				Robot.gearReleaseSubsystem.Launch(true, false);
			}
	}

	@Override
	protected void initialize() {

	

}

// Make this return true when this Command no longer needs to run execute()
@Override
protected boolean isFinished() {
  return false;

}}