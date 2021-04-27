# Proxy Design Pattern

The proxy pattern is a design pattern that creates a surrogate, or placeholder class. 
Proxy instances accept requests from client objects, pass them to the underlying object and return the results. 
Proxies can improve efficiency and enhance functionality. There are many kinds of proxies utilizing the same pattern to 
intercept calls intended for the inner object.

**Pattern**:

An abstract class or interface is implemented by both a proxy class and business class. The proxy then composes an instance
of the business class. As the interfaces are identical the proxy can intercept calls intended for the business class. Instead 
of the client consuming the business class directly it uses the proxy.

**Examples:**

1. Cache Proxy

This is what the sample code is based on. Our sample code has a very simple cache that remembers the result of a previous 
call to the business class. When the call is made again the result is returned from the cache.

2. Validation Proxy

The same pattern can be used to apply complex rule based validation logic before passing on arguments to a business class.

3. Remote Proxy

The remote proxy can be used to invoke methods on a remote object. The proxy can take care of ensuring that all the network
communication semantics are in place.

4. Smart Proxy

Can manipulate the result of the business class before passing along back to the client. One could add formatting, value 
conversion, logging etc.

5. Virtual Proxy

Can be used to orchestrate lazy loading hierarchical object graphs, and provide just in time loading by inspecting the incoming
arguments. 

6. Combination Proxy

Could be a combination of the above. 


As we can see this is a very easy and important design pattern to know. You will mostly use this intercept calls both inbound for 
the business class or outbound for the consumer. 


Players:
1. Business Class >> NumberMultiplier
2. ProxyClass >> NumberMultiplierProxy
3. Abstract >> CalculatorBase 

Both Business and Proxy implement the abstraction, and the client then consumes the proxy.

   

