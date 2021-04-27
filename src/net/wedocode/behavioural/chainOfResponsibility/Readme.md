# Chain of Responsibility

The chain of responsibility pattern is a design pattern that defines a linked list of handlers, each of which is able to 
process requests. When a request is submitted to the chain, it is passed to the first handler in the list that is able to 
process it.

### Type

Behavioral


### Description

The chain of responsibility pattern is used to process varied requests, each of which may be dealt with by a different handler. 
The design pattern promotes loose coupling by allowing a series of handlers to be created in a linked list or chain. 
The request is passed to the first handler in the chain, which will either process it or pass it on to its successor. 
This continues until the request is processed, or the end of the chain is reached. 
The handler responsible for the final processing of the request need not be known beforehand.




