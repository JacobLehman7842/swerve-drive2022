// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  private MotorController left1;
  private MotorController left2;
  private MotorController right1;
  private MotorController right2;
  private MotorController rotate;
  public DriveTrain() {
    left1 = new CANSparkMax(Constants.DriveTrain.DRIVE_CAN_LEFT1, MotorType.kBrushless);
    left2 = new CANSparkMax(Constants.DriveTrain.DRIVE_CAN_LEFT2, MotorType.kBrushless);
    right1 = new CANSparkMax(Constants.DriveTrain.DRIVE_CAN_RIGHT1, MotorType.kBrushless);
    right2 = new CANSparkMax(Constants.DriveTrain.DRIVE_CAN_RIGHT2, MotorType.kBrushless);
    rotate = new VictorSP(Constants.DriveTrain.DRIVE_PWM_ROTATE);
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
