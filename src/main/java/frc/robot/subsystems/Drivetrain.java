package frc.robot.subsystems;
//import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

//import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
// import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Encoder;

public class Drivetrain extends Subsystem{
    // LEFT DRIVETRAIN
    private final WPI_VictorSPX leftMoterController2 = new WPI_VictorSPX(RobotMap.TALON_LEFT_DRIVE_PORTS[1]);
    private final WPI_VictorSPX leftMoterController3 = new WPI_VictorSPX(RobotMap.TALON_LEFT_DRIVE_PORTS[2]);

    // RIGHT DRIVETRAIN
    private final WPI_VictorSPX rightMoterController2 = new WPI_VictorSPX(RobotMap.TALON_RIGHT_DRIVE_PORTS[1]);
    private final WPI_VictorSPX rightMoterController3 = new WPI_VictorSPX(RobotMap.TALON_RIGHT_DRIVE_PORTS[2]);

    // Grouping controllers
    private final SpeedControllerGroup lControllerGroup = new SpeedControllerGroup(leftMoterController2, leftMoterController3);
    private final SpeedControllerGroup rControllerGroup = new SpeedControllerGroup(rightMoterController2, rightMoterController3);

    // Differential drive
    private final DifferentialDrive drive = new DifferentialDrive(lControllerGroup, rControllerGroup);

    // PID controller constant
    static private final double kp = 2;
    //static private final double ki = 0;
    //static private final double kd = 0;
    
    // PID controllers
    //private final PIDController leftPidController = new PIDController(kp, ki, kd);
    //private final PIDController rightPidController = new PIDController(kp, ki, kd);

    // public Encoder leftEncoder = new Encoder(RobotMap.LEFT_ENCODER_PORTS[0], RobotMap.LEFT_ENCODER_PORTS[1], false, Encoder.EncodingType.k2X);
    // public Encoder rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_PORTS[0], RobotMap.RIGHT_ENCODER_PORTS[1], false, Encoder.EncodingType.k2X);
    // double error;
    // double turn_power;

    public void drivetrain(double leftSpeed, double rightSpeed){
        // error = leftEncoder.getDistance() - rightEncoder.getDistance();
        // turn_power = kp * error;
        this.drive.arcadeDrive(-leftSpeed, rightSpeed, false);
        // leftEncoder = new Encoder(RobotMap.LEFT_ENCODER_PORTS[0], RobotMap.LEFT_ENCODER_PORTS[1], false, Encoder.EncodingType.k2X);
        // rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_PORTS[0], RobotMap.RIGHT_ENCODER_PORTS[1], false, Encoder.EncodingType.k2X);
    }

    @Override
    protected void initDefaultCommand() {

    }


}

