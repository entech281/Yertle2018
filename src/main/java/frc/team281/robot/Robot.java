
package frc.team281.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team281.robot.commands.Autonomous;
import edu.wpi.first.wpilibj.Compressor;
import frc.team281.robot.subsystems.DriveSubsystem;
import frc.team281.robot.subsystems.ProngsSubsystem;
import frc.team281.robot.subsystems.ShooterOutTakeSubsystem;
import frc.team281.robot.subsystems.ShooterInTakeSubsystem;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends TimedRobot {

	public final        DriveSubsystem          _driveSubsystem           = new DriveSubsystem();
	public final static ProngsSubsystem         _prongsSubsystem          = new ProngsSubsystem();
	public final static ShooterOutTakeSubsystem m_ShooterOutTakeSubsystem = new ShooterOutTakeSubsystem();
	public final static ShooterInTakeSubsystem  m_ShooterInTakeSubsystem  = new ShooterInTakeSubsystem();
	public       static OI oi;
	private Command m_AutonomousCommand;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		oi = new OI();
		Compressor compressor = new Compressor(RobotMap.PCModuleCANid);
		compressor.start();
		m_AutonomousCommand=new Autonomous(_driveSubsystem);
	}

	@Override
	public void autonomousInit() {
		m_AutonomousCommand.start();
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void disabledInit() {

	}
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
	}

	/**
	 * This function is called periodically during operator control
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
}
