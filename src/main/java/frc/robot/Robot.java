// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import static lib.Romi.driveTime;
import static lib.Romi.turnTime;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {
    // Write your code here:
    Romi.driveTime(0.3,2);
    Romi.turnTime(1,1.2);
    Romi.driveTime(0.3,2);
    System.out.println("50% chance");
    Romi.turnTime(-1,1.8);
    Romi.sleepSeconds(0.2);
    Romi.driveTime(0.3,2);
    Romi.driveTime(-0.3,2);
    Romi.turnTime(1,0.9);
    Romi.driveTime(0.8,1.618);
  }
}
