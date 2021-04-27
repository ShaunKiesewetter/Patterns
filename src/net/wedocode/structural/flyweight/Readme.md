# Flyweight Design Pattern

The flyweight pattern is a design pattern that is used to minimise 
resource usage when working with very large numbers of objects. When creating many thousands of identical objects, 
stateless flyweights can lower the memory used to a manageable level.

When you need to create a very large number of objects, each requires an amount of memory to store the object's state. 
Even if the storage requirements for each individual object are small, the number of objects may cause the overall memory 
usage to be high. Depending upon the scenario and the target environment, the memory usage may be so high that the program 
cannot execute.

In some cases, the objects being created may include information that is often duplicated. Where this is true, 
the flyweight pattern can be used. When this pattern is applied, the properties of the objects that are shared and are 
reasonably unchanging are moved into flyweight objects. For each of the main objects that use the shared data, 
only a reference to the appropriate flyweight object is required. 
This can drastically reduce the memory used by each of the main objects.

Pattern 

Let's consider a battle game. There will be thousands of soldiers, marines and tanks on the battle-field. 
Our program will need to create thousands of objects for the simulation.

Unit >> Abstract DataClass containing readonly values

Soldier >> Inherits Unit simply added so that we can see that we can still operate a flyweight entity with some of 
its data optimized.

Tank >> Inherits Unit which is a variation of soldier.

Target >> Composes the unit and can could represent any entity on the battle-field

UnitFactory >> Similar to a builder, it is responsible for creating and configuring Unit data.
The client will use this factory to configure the Target's unit data. As the unit data is readonly 
each target type will point of the same unit data. The unit class is considered to be the flyweight. 

