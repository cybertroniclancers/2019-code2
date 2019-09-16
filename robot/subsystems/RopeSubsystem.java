/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;


import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;
import frc.robot.commands.RopeCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;

public class RopeSubsystem extends Subsystem {
	Victor rope;
	Victor insidelift;
	Victor ballcapture;


	public RopeSubsystem(){
	rope = new Victor(3);
	insidelift = new Victor(4);
	ballcapture = new Victor(5);

	}
	@Override
	protected void initDefaultCommand() {
		 setDefaultCommand(new RopeCommand());
	}
	public void Ropeup(Joystick sticky){
	double upvalue = sticky.getRawAxis(RobotMap.RIGHT_TRIGGER);
	double downvalue = sticky.getRawAxis(RobotMap.LEFT_TRIGGER);
//	if (upvalue < 0)
//		rope.set(0);
	rope.set(upvalue-downvalue);
	}
	public void Ropedown(Joystick sticky){
    double downvalue = sticky.getRawAxis(RobotMap.LEFT_TRIGGER);
    rope.set(-downvalue);
	}
	public void StopRope(){
	rope.set(0);
	}
	//Adding Left Joystick on Xbox 360 controller using the y-axis
	//Rope is the outside lift
	//insidelift is the inside lift

	public void InsideLift(Joystick sticky){
		double insidevalue = sticky.getRawAxis(RobotMap.LEFT_STICK_Y_AXIS);
		insidelift.set(insidevalue);
	}
//Adding Right Joystick on Xbox 360 controller using the y-axis
	//Rope is the outside lift
	//insidelift is the inside lift

	public void BallCapture(Joystick sticky){
		double ballvalue = sticky.getRawAxis(RobotMap.RIGHT_STICK_Y_AXIS);
		ballcapture.set(ballvalue);
	}


	
}
