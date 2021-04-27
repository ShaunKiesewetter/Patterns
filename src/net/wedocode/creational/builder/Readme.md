# Builder Pattern

### Description:

The builder pattern is a design pattern that allows for the step-by-step creation of complex objects using the correct 
sequence of actions. The construction is controlled by a director object that only needs to know the type of object 
it is to create.

### Usage:

The abstract factory pattern is used to provide a client with a set of related or dependant objects. The "family" of objects
created by the factory is determined at run-time according to the selection of concrete factory class.

An example of this pattern could exist is an integrated development environment. 
Users are able to create a new (File|New a screen > Type)  screen.  The model in the background is a Frame. 
Using this model, when the user selects a "Fixed Square Screen" the generic frame model is configured with the appropriate
data to support the expected run time behavior. The director can do upper lever configuration orchestration. When it does
this is would typically be based on context. For example if is the screen creation under runtime or design time behavior?