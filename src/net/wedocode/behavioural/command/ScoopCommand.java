package net.wedocode.behavioural.command;

public class ScoopCommand extends RobotCommand{

    public Boolean scoopUpwards;

    public ScoopCommand(Robot robot) {
        super(robot);
    }

    @Override
    public void execute() {
        robot.scoop(scoopUpwards);
    }

    @Override
    public void undo() {
        robot.scoop(!scoopUpwards);
    }
}
