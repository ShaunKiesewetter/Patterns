## Adapter

The adapter pattern is a design pattern that is used to allow two incompatible types to communicate. 
Where one class relies upon a specific interface that is not implemented by another class, the adapter acts as a 
translator between the two types.


Problem

We have a class that has a method or constructor that seeks a particular contract or abstract type as a parameter input. 
You have a business class that provides a good implementation however it does not satisfy this value. We do not wish to 
change either of the existing classes. In this case we create a NEW class called the Adapter which will implement the required 
contract or extend the required abstraction composing the adaptee to within its implementation.

Also known as the wrapper pattern.

Players:

1. An existing class call PizzaOven that has a cook method on it accepting a Cookable abstraction.
2. An existing class called Hamburger, it knows what to do when cooked but does not have the Cookable abastraciton.
3. An existing abstract class called Cookable
4. A new class call PizzaAdapter to adapt our Hamburger to go into the Pizza oven cook method.
