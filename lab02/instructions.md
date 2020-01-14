# CIS 163 Lab 02 - Debugging with a Debugger (IDE)

## Objectives

After completing this lab, you should be able to:

* Understand how and when debuggers can be useful
* Step through code with a debugger
* Setup breakpoints
* Examine variable values during code execution

## Lab Steps

### Part One - Setup

1. Download the lab files BuggyOne.java, BuggyTwo.java, and BuggyTwoTest.java.
2. Create a new project (I’d suggest naming it lab02, but that is up to you).
3. Place these 3 files inside the src directory.
4. Hover over the top line `package lab02;`.
   There should be an option to create/move to package.
   If not, right click on `src`, then `New -> Package`
   (name the package `lab02`).  Move these files into the package.

### Part Two - Debugging BuggyOne

1. Click "Edit Configurations".  Create a configuration called "MainB1".
   Select this to run the Main class in BuggyOne, then click ok.
2. Run the code once to see the output.  It runs without throwing any
   exceptions, but the answer is incorrect.
3. Instead of just running it, we'll now set "breakpoints" and step through
   the code.  Set a breakpoint on line 12 by clicking just to the right of
   line number 12 (a red dot should appear).
4. Press the green bug icon in the upper right (just to the right of the green
   play arrow).
5. Now, ad the bottom you should see an indication of what line the program is
   on (it should also be highlighted).  Next to that, you should see a
   window listing all of the variables currently existing and their values.
6. Click the blue downpointing arrow (look above the variables window).  This
   is the "Step Into" button.  This
   will step through the code including going into any functions.  Press this
   a few times to understand what it is doing.
7. Remove the breakpoint by clicking on it (red dot should disappear).
8. Set a breakpoint at line 32.  Restart debugging (press the green
   bug icon again).  Now, try
   pressing the same "Step Into" button.  Then, restart
   debugging again and try pressing the blue arrow that goes up then
   down (just to the left of "Step Into").  This is the "Step Over"
   option.  Compare what it does to the previous button.
9. Use these debugging tools to identify and fix this code.

### Part Two

1. Click "Edit Configurations". Create a new configuration (Click the +, then
   leave it selected on "Application".  Name this configuration "MainB2".
   Select this to run the Main class in BuggyTwo, then click ok.
2. Run to see the current state of the code.
3. Set breakpoints and use the debugger to fix this code.

### Part Three

1. Click "Edit Configurations".  Create a new configuration called
   "All tests" (this should be a JUnit).  Select all in package (and
   enter lab02 as the package.
2. Run this configuration to make sure your code for BuggyTwo passes
   all tests.  If not, try to continue using the debugger until you pass all
   of the tests (
