package net.wedocode.behavioural.command;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class RobotController {

    public Queue<RobotCommand> commands;

    private Stack<RobotCommand> undoStack;

    public RobotController(){
        commands = new LinkedList<RobotCommand>();
        undoStack = new Stack<RobotCommand>();
    }

    public void executeCommands(){
        System.out.println("EXECUTING COMMANDS.");

        while (!commands.isEmpty())
        {
            RobotCommand command = commands.remove();
            command.execute();
            undoStack.push(command);
        }
    }

    public void undoCommends(Integer numberOfUndos){
        System.out.println(String.format("REVERSING %s COMMANDS(s)", numberOfUndos));
        while(numberOfUndos > 0 && !undoStack.isEmpty()){
            RobotCommand command = undoStack.pop();
            command.undo();
            numberOfUndos --;
        }
    }




}
