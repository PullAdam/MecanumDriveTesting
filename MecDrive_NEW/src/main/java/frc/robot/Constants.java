// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {

    public final class k_chassis {
        //Chassis Motor ports
        public final static int leftFrontMotorPort = 1;
        public final static int rightFrontMotorPort = 0;
        public final static int rightRearMotorPort = 3;
        public final static int leftRearMotorPort = 2;

        //chassis speeds
        public final static double normalDriveSpeed = 0.9;
        public final static double slowDriveSpeed = 0.5;
        public final static double normalRotationSpeed = 0.5;
        public final static double slowRotationSpeed = 0.2;

        public final static double gyro = 0;
    }

    public final class k_xbox {
    //button numbers from 2021-22 Robot Code
        public static final int buttonA = 2;
        public static final int buttonLeftBumper = 5;
        public static final int buttonRightBumper = 6;
        public static final int buttonB = 3;
        public static final int buttonY = 4;
        public static final int buttonLeftLowerBumper = 7;
        public static final int buttonRightLowerBumper = 8;
        public static final int buttonBack = 9;
        public static final int buttonStart = 10;
        public static final int leftXAxis = 0;
        public static final int leftYAxis = 1;
        public static final int rightXAxis = 2;
        public static final int rightYAxis = 3;
        public static final int buttonX = 1;
    }
}