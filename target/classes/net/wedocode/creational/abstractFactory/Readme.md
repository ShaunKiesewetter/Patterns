## Abstract Factory

### Type:

Creational Pattern

### Description:

The abstract factory pattern is a design pattern that allows for the creation of groups of related objects without the 
requirement of specifying the exact concrete classes that will be used. One of a number of factory classes generates the 
object sets.

### Usage:

The abstract factory pattern is used to provide a client with a set of related or dependant objects. The "family" of objects 
created by the factory is determined at run-time according to the selection of concrete factory class.

As an example, consider a program that assists with the packaging and delivery of items for a web-based store. 
The company delivers two types of product. The first is a standard product that is placed in a box and delivered through 
the post with a simple label. The second is a delicate item that requires shockproof packaging and is delivered via a 
courier that requires a detailed manifest.

In this situation, there are two types of object required, a packaging object, and a delivery documentation object. 
We could use two factories to generate these related objects. The StandardPurchaseFactory may produce StandardPackaging 
and PostalLabel objects whilst the DelicatePurchaseFactory creates ShockProofPackaging and CourierManifest objects.