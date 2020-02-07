# Bunny Population Modeling

Fibonacci's original idea was modeling the bunny population
* Start with 1 (M,F) pair of bunnies
* All bunnies are fully grown after 1 month
* All fully grown bunnies reproduce every month
    * always reproduce 1 new (M,F) pair

In other words:
* All bunnies existing in previous month still exist next month
* Any bunny pairs existing in month before previous month will
  be mature and reproduce a new pair of bunnies

This model gives:
$$P(n) = P(n-1) + P(n-2)$$

This produces the sequence
$$1,1,2,3,5,8,\ldots$$

## Task 1
Complete the function below with an iterative
implementation of the model to compute these
values.  Assume 1-based numbering
of months (so the first month is 1, not 0).

```
public static void int piterative(int n) {














}
```

## Task 2

Complete the function below with an iterative
implementation of the model to compute these
values.  Assume 1-based numbering
of months (so the first month is 1, not 0).

```
public static void int precursive(int n) {













}
```

## Task 3

Think about what work the computer has to do for
each of these different implementations.  Is one
more efficient than the other in terms of the amount
of work required by the computer?  Talk to other people
around you.  Be prepared to justify your answer.

