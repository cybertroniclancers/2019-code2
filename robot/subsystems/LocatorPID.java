/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;



import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogOutput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;


/** This is the main system that controls all motor functions related to wheels..
 *
 *	@author BV
 */



public class LocatorPID extends Subsystem {
	


@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub

}

public DigitalInput coginsert = new DigitalInput(2);
//public AnalogOutput findcogout = new AnalogOutput(0);
public AnalogInput findcogin = new AnalogInput(0);



public boolean IsCogonPole(){
	return coginsert.get();
}




public double Cogdistance(){
//	findcogout.setVoltage(5);
double volts = findcogin.getVoltage();
int bits;
findcogin.setOversampleBits(4);
bits = findcogin.getOversampleBits();
findcogin.setAverageBits(2);
bits = findcogin.getAverageBits();
//int averageRaw = findcogin.getAverageValue();
//double averageVolts = findcogin.getAverageVoltage();
return volts*5120/5;
}

public double CogVoltage(){
	return findcogin.getVoltage();
}
}