/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;




import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class GearReleaseSubsystem extends Subsystem {
	
	  Solenoid piston1;
	  Solenoid retract1;
	  Solenoid piston2;
	  Solenoid retract2;
	  Solenoid piston3;
	  Solenoid retract3;
	  Solenoid piston4;
	  Solenoid retract4;
	  
	  public GearReleaseSubsystem(){
	  piston1 = new Solenoid(RobotMap.PISTON_1);
	  retract1 = new Solenoid
			  (RobotMap.RETRACT_1);
	  piston2 = new Solenoid(RobotMap.PISTON_2);;
	  retract2 = new Solenoid(RobotMap.RETRACT_2);
	  piston3 = new Solenoid(RobotMap.PISTON_3);
	  retract3 = new Solenoid(RobotMap.RETRACT_3);
	  piston4 = new Solenoid(RobotMap.PISTON_4);
	  retract4 = new Solenoid(RobotMap.RETRACT_4);

	  }
	  
	  public void PushCylinder(){ 	
	    	piston1.set(true);
	    	retract1.set(false);
	    }
	  
	  public void RetractCylinder(){
	    	piston1.set(false);
	    	retract1.set(true);

	  }

	       
	public void Piston1(boolean piston, boolean retract){
		piston1.set(piston);
		retract1.set(retract);
		}
	  public void Launch(boolean piston, boolean retract){
		  piston2.set(piston);
		  retract2.set(retract);
		  }
	  
	  public void Piston_3(boolean p, boolean r){
		  piston3.set(p);
		  retract3.set(r);
	  }

	  public void Cylinder_4(boolean p4, boolean r4){
		  piston4.set(p4);
		  retract4.set(r4);
	  }

	@Override
	protected void initDefaultCommand() {
		
		
	}
	
}