package org.usfirst.frc.team2141.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	public static final int RIGHT_MOTOR_A = 1;
	public static final int RIGHT_MOTOR_B = 2;
	public static final int RIGHT_MOTOR_C = 3;
	public static final int LEFT_MOTOR_A = 4;
	public static final int LEFT_MOTOR_B = 5;
	public static final int LEFT_MOTOR_C = 6;

	public static final int LEFT_SHIFTER_CHANNEL_A = 0;
	public static final int LEFT_SHIFTER_CHANNEL_B = 1;
	public static final int RIGHT_SHIFTER_CHANNEL_A = 2;
	public static final int RIGHT_SHIFTER_CHANNEL_B = 3;
	
	public static final int LEFT_ENCODER_CHANNEL_A = 0;
	public static final int LEFT_ENCODER_CHANNEL_B = 1;
	public static final int RIGHT_ENCODER_CHANNEL_A = 2;
	public static final int RIGHT_ENCODER_CHANNEL_B = 3;
	
	
	public static final double SPEED_THRESHOLD = 100;


}
