package frc.team281.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team281.robot.Robot;
import frc.team281.robot.subsystems.ProngsSubsystem;

/**
 *
 */
public class ProngsDown extends Command {
	private ProngsSubsystem prongs;
	public ProngsDown(ProngsSubsystem prongs) {
		// Use requires() here to declare subsystem dependencies
		this.prongs = prongs;
		requires(prongs);
		setTimeout(0.5);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		prongs.lower();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
