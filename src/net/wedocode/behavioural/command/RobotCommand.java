package net.wedocode.behavioural.command;

public abstract class RobotCommand {
    protected Robot robot;

    public RobotCommand(Robot robot){
        this.robot = robot;
    }

    public abstract void execute();

    public abstract void undo();
}
