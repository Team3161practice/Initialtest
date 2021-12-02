package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.controller.PIDController;
import frc.robot.Robot;
import frc.robot.RobotMap;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import ca.team3161.lib.robot.subsystem.AbstractSubsystem;


public class Drivetrain {
    // LEFT DRIVETRAIN
    private final WPI_TalonSRX leftMoterController1= new WPI_TalonSRX(RobotMap.TALON_LEFT_DRIVE_PORTS[0]);
    private final WPI_VictorSPX leftMoterController2 = new WPI_VictorSPX(RobotMap.TALON_LEFT_DRIVE_PORTS[1]);
    private final WPI_VictorSPX leftMoterController3 = new WPI_VictorSPX(RobotMap.TALON_LEFT_DRIVE_PORTS[2]);

    // RIGHT DRIVETRAIN
    private final WPI_TalonSRX rightMoterController1 = new WPI_TalonSRX(RobotMap.TALON_RIGHT_DRIVE_PORTS[0]);
    private final WPI_VictorSPX rightMoterController2 = new WPI_VictorSPX(RobotMap.TALON_RIGHT_DRIVE_PORTS[1]);
    private final WPI_VictorSPX rightMoterController3 = new WPI_VictorSPX(RobotMap.TALON_RIGHT_DRIVE_PORTS[2]);

    // Grouping controllers

    private final SpeedControllerGroup lControllerGroup = new SpeedControllerGroup(leftMoterController1, leftMoterController2, leftMoterController3);
    private final SpeedControllerGroup rControllerGroup = new SpeedControllerGroup(rightMoterController1, rightMoterController2, rightMoterController3);

    // Differential drive

    private final DifferentialDrive drive = new DifferentialDrive(lControllerGroup, rControllerGroup);

    public void driveTrain(double leftSpeed, double rightSpeed){
        this.drive.tankDrive(leftSpeed, rightSpeed);
    }


}

