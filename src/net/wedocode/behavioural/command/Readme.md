#Command Pattern

The command pattern is a design pattern that enables all the information for a request to be contained within a single 
object. The command can then be invoked as required, often as part of a batch of queued commands with rollback capabilities.

##Description

In the example the pattern was used to control the actions of a robot. This robot would be remotely controlled, as it
would be on the surface of another planet.

In the example, the commands dictate the movement of the robot and the use of a scoop to sample the planet's surface. 
The receiver would be the robot itself, and the invoker would be a timed system running within the robot's software. 
The client would be controlled by the users on Earth who could create a queue of commands. The robot would also include 
an undo function to reverse a number commands as required.
