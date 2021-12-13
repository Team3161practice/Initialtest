package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;



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
    static private final double ki = 0;
    static private final double kd = 0;
    
    // PID controllers
    private final PIDController leftPidController = new PIDController(kp, ki, kd);
    private final PIDController rightPidController = new PIDController(kp, ki, kd);

    
    public void drivetrain(double leftSpeed, double rightSpeed){
        this.drive.tankDrive(leftSpeed, rightSpeed);
    }

    @Override
    protected void initDefaultCommand() {

    }


}

