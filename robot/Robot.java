package frc.robot;



import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import frc.robot.commands.AutonomousDriveCommand;
import frc.robot.commands.DriveCommand;
import frc.robot.commands.DumpBallCogandCrossLine;
import frc.robot.commands.DumpBallandCrossLine;
//import org.usfirst.frc.team6087.robot.commands.DriveCommand;
import frc.robot.commands.ForwardOnly;
import frc.robot.subsystems.GearReleaseSubsystem;
import frc.robot.subsystems.chassisSubsystem;
import frc.robot.subsystems.LocatorPID;
import frc.robot.subsystems.RopeSubsystem;
import frc.robot.subsystems.SteamGetterSubsystem;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */


public class Robot extends TimedRobot {
    //Constructor for OI Class
	public static OI oi;
	
	//Constructors to be used as References for Command Codes.  The subsystems that are classes
	//in different code can be accessed as objects in Command Codes.
	public static chassisSubsystem chassisSubsystem = new chassisSubsystem();
	public static GearReleaseSubsystem gearReleaseSubsystem = new GearReleaseSubsystem();
	public static LocatorPID locatorPID = new LocatorPID();
	public static RopeSubsystem ropeSubsystem = new RopeSubsystem();
	public static SteamGetterSubsystem steamGetterSubsystem = new SteamGetterSubsystem();
	
	//Misc. Constructors
	Timer t;
    Command autonomousCommand;
    SendableChooser<Object> chooser;
	Thread thread=null;
	

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	//List of constructors
    	oi = new OI();
        chooser = new SendableChooser<Object>();
        
        //List of Active code for SmartDashboard
        chooser.setDefaultOption("Default Auto", new DriveCommand());
        chooser.addOption("Auto Code", new AutonomousDriveCommand());
        chooser.addOption("forward only", new ForwardOnly());
  //      chooser.addObject("Drop Balls off, Gear off", new DumpBallCogandCrossLine());
        chooser.addOption("Drop Balls off, then Base Line", new DumpBallandCrossLine());
 //     SmartDashboard.putData("Auto mode", chooser);
     	SmartDashboard.putString("Auto Selector", "Forward Only");
     	SmartDashboard.putNumber("Analog Voltage", locatorPID.CogVoltage());
     	SmartDashboard.putNumber("Analog Distance ", locatorPID.Cogdistance());
     	
     	// Here is the camera code to be separated from SmartDashboard code
     	CameraServer.getInstance().startAutomaticCapture();
     
     	
     	
        
  		
  		}
	/**
     * This function is called once each time the robot enters Disabled mode.
     * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
     */
    public void disabledInit(){	
   	}
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select between different autonomous modes
	 * using the dashboard. The sendable chooser code works with the Java SmartDashboard. If you prefer the LabVIEW
	 * Dashboard, remove all of the chooser code and uncomment the getString code to get the auto name from the text box
	 * below the Gyro
	 *
	 * You can add additional auto modes by adding additional commands to the chooser code above (like the commented example)
	 * or additional comparisons to the switch structure below with additional strings & commands.
	 */
    public void autonomousInit() {
  // 	autonomousCommand = (Command) chooser.getSelected();
    	
 //  	String autoSelected = SmartDashboard.getString("Auto Selector", "Forward Only");
//		switch(autoSelected) {
//		default:
//		case "Forward Only":
    	
    	//THIS IS WHERE YOU CAN CHANGE OUT AUTO CODES
//    	CODE 1
		//autonomousCommand = new ForwardOnly();
//								break;
//								case "Forward with the Cog":
//      CODE 2    	
//		autonomousCommand = new DumpBallandCrossLine();
//		break;
//		}
		//
	   	// schedule the autonomous command (example)
       if (autonomousCommand != null) autonomousCommand.start();
    }
     
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
      //System.out.println(locatorPID.Cogdistance());
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        System.out.format("Distance is", locatorPID.Cogdistance());
        System.out.format("Limit Switch has a signal of", locatorPID.IsCogonPole());
        System.out.format("Cog Voltage is", locatorPID.CogVoltage());
        
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
        //System.out.println(locatorPID.Cogdistance());
    }
    
    
    
    
    }
    
