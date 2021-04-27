# Visitor Pattern

The visitor pattern is a design pattern that separates a set of structured data from the functionality that may be 
performed upon it. This promotes loose coupling and enables additional operations to be added without modifying the data 
classes.

## Type
####Behavioural 
This pattern defines a manner for controlling communication between classes and entities.

## Description
The visitor pattern is used to separate a relatively complex set of structured data classes from the functionality that
may be performed upon it. The pattern allows each data class to be visited in turn without knowing the details of the
structure.

Supporting the open closed principle the key benefit of this pattern is to easily add new operations. The classes of the 
data structure are initially created with the inclusion of a method that may be called by a visitor object. 
This method performs a callback to the visitor, passing itself to the visitor's method as a parameter. 
The visitor can then perform operations upon the data object. To add a new operation, a new visitor class 
is created with the appropriate callback method. The data classes need no further modification.

A second benefit of the design pattern is that a single visitor object is used to visit all elements of the data structure. 
The visitor object can maintain state between calls to individual data objects.

## Players

### Client - Main runVisitor()
The Client class is a consumer of the classes of the visitor design pattern. 
It has access to the data structure objects and can instruct them to accept a Visitor to perform the appropriate processing.

### ObjectStructure - OrganisationalStructure
The ObjectStructure class holds all the elements of the data structure that can be used by visitors. The elements may 
be held in a simple collection, or a more complex structure. The class includes a method, "accept()", that can be called 
by the client with a Visitor object passed as a parameter. The ObjectStructure class then enumerates the contained elements, 
calling the accept() method of each and passing the provided Visitor. This allows each element to be processed without 
the client requiring any knowledge of the elements beforehand.

### ElementBase - Employee Base
This is an abstract base class for all data classes. It should also abstractly define the visit() method.

### ConcreteElement A/B. - Director, Supervisor
Concrete element objects are those that hold real information in the data structure. To enable their use with the visitor 
design pattern, each must implement the accept() method. Usually the accept() method simply performs a callback to the visitor 
object. When the callback is made, the element object is passed to the visitor's visit() method so that it may execute an 
algorithm using the element's data.

### VisitorBase - VisitorBase
This class is the abstract base class for all concrete visitors. It defines a method names "visit",
that can be called by element objects during the callback process. The method is generally overloaded with a version that 
is capable of processing any of the concrete element types.

### ConcreteVisitor A/B - PayrollVisitor, PayRaiseVisitor
The concrete visitor classes contain the operations that are applied to the concrete element objects. They implement the 
various overloaded visit methods defined in the VisitorBase class.