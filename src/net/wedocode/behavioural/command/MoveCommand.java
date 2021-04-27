package net.wedocode.behavioural.command;

public class MoveCommand extends RobotCommand{

    public Integer forwardDistance;

    public MoveCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.move(forwardDistance);
    }

    @Override
    public void undo() {
        robot.move(-forwardDistance);
    }
}
