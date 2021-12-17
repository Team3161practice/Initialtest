package frc.robot;

public final class RobotMap {
    // Drive ports
    public static final int[] TALON_LEFT_DRIVE_PORTS = {10, 2, 8}; 
    public static final int[] TALON_RIGHT_DRIVE_PORTS = {9, 5, 6}; 
    // 1 WPI_TalonSRX and 2 WPI_VictorSPX per side.

    // controller ports
    public static final int DRIVER_PAD_PORT = 0;

    public static final int OPERATOR_PAD_PORT = 1;

    // ENCODERS PORTS (check if the ports are correct)
    public static final int[] LEFT_ENCODER_PORTS = {2, 3}; 
    public static final int[] RIGHT_ENCODER_PORTS = {1, 0}; 

    // Here we can add other constants to modify them in the entire codebase, only change if you
    // you have changed the ports on the robot
}
