# Decorator Pattern

## GOF Definition

The decorator pattern is used to extend or alter the functionality of objects at run-time by wrapping them in an object of a decorator class. 
This provides a flexible alternative to using inheritance to modify behaviour.

## Problem

In this case we have a simple Pizza shop. The original requirement was that customers wanted to purchase and order
Pizzas of different sizes. Each Pizza class simply had to produce a description and calculate its cost for the invoicing and menu
displays. An abstraction of Pizza was created and then subclassed in to the variations. (Big, Med, Small)

Motivation:
As it happens, after the system was delivered the customers now want toppings, which effect the Pizza description and costing.

If we attempted to create a subclass to encapsulate this deviation of the use case then
for every Pizza/topping combination we would have a new class:
Example: SmallPizzaOliveCheese, LargePizzaOliveCheese, MedPizzaOliveCheese, SmallPizzaCheese, LargePizzaCheese ....
And this would get much worse should we add more attributes of concern. This cannot be maintained. This is where we need
this beautiful behavioral pattern.


Patten intent:
1. Add functionality to existing classes dynamically
2. Alternate to subclassing
3. Flexible Design
4. Support the open closed principle  (the O in the SOLID acronym)

Applicability:
1. Legacy code.
2. Adding functionality to controls
3. Sealed classed. (UI Control typically that may be sealed)
