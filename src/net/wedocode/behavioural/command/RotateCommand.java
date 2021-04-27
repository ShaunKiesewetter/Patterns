package net.wedocode.behavioural.command;

public class RotateCommand extends RobotCommand{

    public Double leftRotation;

    public RotateCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.rotateLeft(leftRotation);
    }

    @Override
    public void undo() {
        robot.rotateLeft(-leftRotation);
    }
}
