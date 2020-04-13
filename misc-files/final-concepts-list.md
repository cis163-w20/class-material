### Big Picture:

With all of the below, you should be able to look at code
and identify what is happening to actually apply these
concepts.  For example (not all inclusive):

* You should be able to go through a provided piece of
  code and identify the output (the code may involve
  references, inheritance, interfaces, exceptions).
* You should be able to draw call graphs of what functions
  are called in a code snippet and follow these back
  (aka identify how many times a function has been called,
  have they all returned, where was this call of this function
  called from)
* You should be able to identify at any point in a code
  snippet the value of all variables in that scope (including
  drawing out what is happening behind the scenes such as
  whether two references actually point to the same memory)
* You should be able to write short relevant pieces of code
* Identify the complexity of any piece of code


### Topic List
Overview of (again, not all inclusive -- there may be concepts
tested on the exam not listed below.

* Java references
    * what are references
    * what impact does this have
    * when will things change
* Arrays/ArrayLists
    * be comfortable using
    * understand code with either
    * understand 2D arrays and how to access
    * what is the difference
    * when we would use one over the other, when to use 2D arrays
* Inheritance
    * When to use inheritance
    * How inheritance is denoted in Java
    * What happens when one class inherits from another
    * Overriding vs Overloading
    * abstract classes, abstract methods
    * purpose of abstract
    * single vs multiple inheritance (what does Java have and why?)
    * when can you instantiate a class?
    * when do you use the `final` keyword?
* Interfaces
    * how they differ from inheritance and abstract classes
    * how you implement one
    * when you should use
    * how interfaces and inheritance can be combined
    * can you instantiate an interface?
    * can a class implement multiple interfaces?
* Polymorphism
    * what is polymorphism?
    * Be able to give/recognize an example.
* Exceptions
    * what are they
    * understand the basics of some common ones
      (Arithmetic, IllegalArgument, NullPointer, etc.)
    * what code will cause an exception
    * how do try/catch blocks work? which catch will be entered? what is finally?
    * checked vs unchecked
    * what must you do with checked (what are your 2 options)?
    * what happens if an unchecked exception is not handled where it occurs?
      you should be able to follow through code what is happening if
      it is handled in a different spot (or not handled at all?)
* Recursion
    * What is it?
    * Be able to understand what recursive code does
        * How many times is it called and with what arguments
        * What is the output
    * Difference between iterative
    * Is there a difference in efficiency between recursive / iterative?
    * What is the idea of memoization?
    * Be able to write a small, simple recursive function
* UML
    * you should understand the different relationships represented in UML
    * given code, you should be able to draw the UML diagram
    * given a diagram, you should be able to sketch out the code excluding
      the actual implementation of any methods 
* Lambdas
    * What they are?
    * Why to use?
    * How they are different from anonymous classes
    * Be able to write a small one
* Collections
    * High level overview of what collection is in java
    * What are they used for
    * How can you sort a collection?
        * Anonymous class
        * Lambda function
* Streams
    * What does it mean to use a stream
    * Be able to write code using streams and lambdas to do any combination of:
        * Filter
        * Sort
        * Create a modified list (ex: change capitalization, map list of objects
          to list of doubles, etc)
* Miscellaneous
    * `static` methods and variables - what are they, how do you access
* Algorithm Analysis / BigO
    * Be able to walk through a piece of code and identify exactly how many times
      each line of code runs
    * Determine the BigO of a given growth function
    * Determine the BigO for a piece of code
    * Be able to compare BigO and no which is faster
* Searching algorithms
    * Understand how linear search works
    * Understand how binary search works
    * Be able to run both on a sample array
    * Know the algorithmic complexity (BigO) of each, e.g.
        * What is the complexity of linear search?
        * What is the complexity of binary search?
* Sorting algorithms
    * Merge sort
    * Selection sort
    * Insertion sort
    * Bubble sort
    * Quick sort
    * For each of the above:
        * Know the complexity / run-time efficiency for the
          average case, worst case, best case
        * Know how they work
        * Be able to walk through them with a sample array
* Linked Lists
    * What they are
    * General form of a linked list
    * How to add, remove, etc without a tail, with a tail,
      with maintaining a size instance variable, without
      maintaining a size instance variable
    * Difference between singly linked and doubly linked lists
    * Efficency / complexity of doing operations
* Stacks and Queues
    * What is a stack?
    * What is a queue?
    * Different options for implementing
