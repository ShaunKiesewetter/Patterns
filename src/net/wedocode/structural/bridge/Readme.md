# **The Bridge Pattern**

The formal definition from the gang of four is a follows: 

_"decouple an abstraction from its implementation so that the two can vary independently"_

This definition is rather confusing, so I am hoping that this simple sample will bring much clarity over what is really 
quite a very simple pattern. At the core of this pattern is a desire to favour composition over inheritance to prevent 
an anti-design pattern known as _class explosion_. It also allows us to construct different combinations of logic to 
satisfy use case variations as opposed to hard coding classes for each known or new variation.

## Our Program

In this sample we will have the following classes representing a domain model for movie license agreements management program.

1. MovieLicense - Abstract Class
2. YearlyMovieLicense - Concrete subclass of the MovieLicense
3. MonthlyMovieLicense - Concrete subclass of the MovieLicense

All is good with above until the business issues the team some new requirements. The business has  decided to introduce 
some discount schemes over there standard license agreements. The discount schemes they are introducing is aimed at different
customer segments:

1. Student discounts
2. Senior discounts

## **The Naive implementation**

Given above problem statement there is an appetite to create some new sub-classes to represent the primary use case variation.
We could now create the following new classes to represent the new problem domain:

1. YearlyStudentDiscountLicense - subclass of YearlyMovieLicense
2. YearlySeniorDiscountLicense - subclass of YearlyMovieLicense
3. YearlyNoDiscountLicense - subclass of YearlyMovieLicense
4. MonthlyStudentDiscountLicense - subclass of MonthlyMovieLicense
5. MonthlySeniorDiscountLicense - subclass of MonthlyMovieLicense
6. MonthlyNoDiscountLicense - subclass of MonthlyMovieLicense

The trap is now set. We have just doubled the amount of classes in our problem domain, and the implementation will now rapidly
grow out of control as soon as additional license, discount or conceptual variations are introduced by the business. 
We can be sure over time that new licenses and discount schemes will be introduced. 
Should we add one new license model and one new discount scheme the then we can expect the following new classes following
the same approach as above.

1. YearlyStudentNewDiscountLicense - additional yearly flavour subclass for new discount.
2. MonthlyStudentNewDiscountLicense - additional monthly flavour subclass for new discount.
3. NewNewDiscountLicense, NewStudentDiscountLicense, NewSeniorDiscountLicense, NewNoDiscountLicense - additional classes for the new license 
derived from MovieLicense
   
Each time a new discount scheme is devised we are forced to provide a new implementation for each of the base classes.
Should the hierarchy deepen, the problem explodes. Example: Imagine YearlyNewDiscountSpecialTermsLicense derived from 
YearlyStudentNewDiscountLicense. We would need a "SpecialTerms" type for each of the base types in all of its variations.
The program is no longer maintainable. Time to refactor.


# Bridge to the rescue
Let's consider our abstractions and decouple them from their implementations.
1. MoveLicense (Abstract concept where variations will most certainly be in order)
2. DiscountScheme (Abstract concept where various rules could apply)

MovieLicense is considered the core abstraction, the discount abstraction should not be baked into the implementation of
the MovieLicense abstraction through inheritance. Let us use composition instead. Injecting a composite abstraction into
the MovieLicense abstraction allows the two abstractions to vary independently of each other.

The composite connection between these two abstractions is known as the **bridge**.

In its simplest form, we the MovieLicense simply needs to compose an abstract discount class, which is fed in through its
constructor. In the construction phase of the license the class is then correctly configured to handle the appropriate variation. 

**Note:**
The decorator pattern is very similar to the Bridge pattern as it also solves the class explosion anti-pattern. The decorator
is specifically aimed at dynamically injecting logic for use case variations over legacy components which should not or cannot change.
Bridge in my opinion is an upfront design decision based on recognizing the potential explosion of classes. 


