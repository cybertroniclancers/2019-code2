/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SteamGetterSubsystem extends Subsystem {

Victor sweeper;

public SteamGetterSubsystem(){
sweeper = new Victor(0);
	}	
	@Override
	protected void initDefaultCommand() {
		
	}

	
public void BallIntake(Joystick single) {
	double value1 = single.getRawAxis(3);
	sweeper.set(-value1);
}
public void StopIntake() {
	sweeper.set(0);
	}
public void ReverseIntake(Joystick single) {
	double value = single.getRawAxis(3);
	sweeper.set(value);
}
}
