// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Chassis extends SubsystemBase {
  //Creates new Chassis
  public Spark leftFrontMotor;
  public Spark leftRearMotor;
  public Spark rightFrontMotor;
  public Spark rightRearMotor;
  private MecanumDrive driveTrain;

  public Chassis() {
    leftFrontMotor = new Spark(Constants.k_chassis.leftFrontMotorPort);
    leftRearMotor = new Spark(Constants.k_chassis.leftRearMotorPort);
    rightFrontMotor = new Spark(Constants.k_chassis.rightFrontMotorPort);
    rightRearMotor = new Spark(Constants.k_chassis.rightRearMotorPort);
    driveTrain = new MecanumDrive(leftFrontMotor, leftRearMotor, rightFrontMotor, rightRearMotor);
  }

  public void driveCartesian(double ySpeed, double xSpeed, double zRotation, double gyroAngle) {
    driveTrain.driveCartesian(ySpeed, xSpeed, zRotation, gyroAngle);
  }

  /*public static void setMaxOutput(double maxSpeed) {
    Chassis.setMaxOutput(0.5);
  }*/

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public Object driveCartesian(double leftX, double leftY, double rightX, Chassis m_chassis) {
    return null;
  }
}