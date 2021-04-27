package net.wedocode.behavioural.command;

public class Robot {

    public void move(Integer forwardDistance){
        if (forwardDistance > 0)
            System.out.println(String.format("Robot moved forwards %s mm.", forwardDistance));
        else
            System.out.println(String.format("Robot moved backwards %s mm.", forwardDistance));;
    }

    public void rotateLeft(Double leftRotation){

        if (leftRotation > 0)
            System.out.println(String.format("Robot rotated left %s degrees.", leftRotation));
        else
            System.out.println(String.format("Robot rotated right %s degrees.", leftRotation));

    }

    public void scoop(Boolean upwards){
        if (upwards)
            System.out.println("Robot gathered soil in scoop.");
        else
            System.out.println("Robot released scoop content.");
    }

}

