// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.Constants.k_chassis;
//import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants.k_xbox;
import frc.robot.commands.AutonomousCommand;
import frc.robot.subsystems.Chassis;

public class RobotContainer {
  private final Chassis m_chassis = new Chassis();
  private final AutonomousCommand m_autoCommand = new AutonomousCommand();

  //creates controller
  XboxController m_chassisController = new XboxController(1); //connect XboxController to port 1
  
  public RobotContainer() {
    configureButtonBindings();

    //new method of moving chassis. Eliminates need for Chassis subsystem because the chassis is the defult command
    m_chassis.setDefaultCommand(new RunCommand(() -> m_chassis.driveCartesian(
        m_chassisController.getRawAxis(k_xbox.leftYAxis) * Constants.k_chassis.normalDriveSpeed,
        m_chassisController.getRawAxis(k_xbox.leftXAxis) * Constants.k_chassis.normalDriveSpeed,
        m_chassisController.getRawAxis(k_xbox.rightXAxis) * Constants.k_chassis.normalRotationSpeed),
        m_chassis)); //eventually should add the gyro sensor as a 4th parameter. This will make feild orriented drive work.
  }

  private void configureButtonBindings() {
    //add button bindings here
    //final JoystickButton buttonLeftLowerBumper = new JoystickButton(m_chassisController, k_xbox.buttonLeftLowerBumper);
    //final JoystickButton buttonRightLowerBumper = new JoystickButton(m_chassisController, k_xbox.buttonRightLowerBumper);

  }

  public Command getAutonomousCommand() {
    return m_autoCommand;
  }
}
