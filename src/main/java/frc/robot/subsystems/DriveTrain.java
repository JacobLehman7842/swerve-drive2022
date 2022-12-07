// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private VictorSP[ ] driveMotors = new VictorSP[4];
  private Encoder rotateEncoder;
  private MotorController rotate;
  
  public DriveTrain() {

    rotate = new VictorSP(Constants.DriveTrain.DRIVE_PWM_ROTATE);
    rotateEncoder = new Encoder(Constants.DriveTrain.DRIVE_DIO_ENCODER1, Constants.DriveTrain.DRIVE_DIO_ENCODER2);

    driveMotors[0] = new VictorSP(Constants.DriveTrain.DRIVE_PWM_LEFT1);
    driveMotors[1] = new VictorSP(Constants.DriveTrain.DRIVE_PWM_LEFT2);
    driveMotors[2] = new VictorSP(Constants.DriveTrain.DRIVE_PWM_RIGHT1);
    driveMotors[3] = new VictorSP(Constants.DriveTrain.DRIVE_PWM_RIGHT2);
    
  }
  public void drive(double x, double y, double z){
    rotate.set(z*Constants.DriveTrain.ROTATE_SPEED_MODIFY);
    forward(y*Constants.DriveTrain.MOTOR_SPEED_MODIFY);
  }
  public void forward(double speed){
    for(int i = 0; i < 4; i++){
      driveMotors[i].set(speed);
    }
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
