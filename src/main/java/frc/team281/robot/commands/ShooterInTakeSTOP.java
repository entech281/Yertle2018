package frc.team281.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team281.robot.Robot;
import frc.team281.robot.subsystems.ProngsSubsystem;
import frc.team281.robot.subsystems.ShooterInTakeSubsystem;
import frc.team281.robot.subsystems.ShooterOutTakeSubsystem;

/**
 *
 */
public class ShooterInTakeSTOP extends Command {
	private ShooterInTakeSubsystem inTake;
	public ShooterInTakeSTOP(ShooterInTakeSubsystem inTake) {
		// Use requires() here to declare subsystem dependencies
		this.inTake = inTake;
		requires(inTake);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		inTake.stop();
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
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
