# Exercise 4 - JUnit

## What is JUnit?

JUnit is a unit testing framework for Java. It is used to test small pieces of code, such as methods, and to ensure that they work as intended.

## What methods are tested here?

Add, Subtract, Multiply and Divide are all tested with different values. The tests are located in the [CalculatorTest.java](src/test/java/CalculatorTest.java) file.

## Add

First, the method is tested with two positive integers. The result should be 36.

Then, a number is added to the max value of a double. The result should be the max value again.

Then, an addition with negative numbers is tested. It should work like a subtraction

## Subtract

First, the method is tested with two positive integers. The result should be normal.

Then, a negative number is subtracted. The result should be the same as adding the number.

Then, a subtraction that results in a negative number is tested. The result should be normal.

## Multiply

First, a normal multiplication is tested. The result should be as expected.

Then, a multiplication with a negative number is tested. The result should be negative.

Then, a multiplication with zero is tested. The result should be zero.

## Divide

First, a normal division is tested. The result should be as expected.

Then, a division with zero is tested. The result should be an error.

Then, a small number is divided by a large number. The result should be as expected.
