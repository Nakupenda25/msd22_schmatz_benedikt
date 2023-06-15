package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Calculator is the class that takes care of all the calculations. It has methods for addition, subtraction, division and multiplication.
 * An instance of Calculator can be created to use the methods for calculating simple math problems.
 * 
 * @author Benedikt Schmatz
 */
public class Calculator {
    private static Logger logger = LogManager.getLogger("");

    /**
     * Adds two numbers together and returns the result.
     *
     * @param number1 First number to add
     * @param number2 Second number to add
     * @return the sum of the two numbers
     * @author Benedikt Schmatz
     */
    public double add(double number1, double number2){
        logger.debug("Addition called with: " + number1 + " and " + number2);
        return number1 + number2;
    }

    /**
     * Subtracts number2 from number1 and returns the result.
     *
     * @param number1 First number to subtract from
     * @param number2 Second number to subtract
     * @return the difference of the two numbers
     * @author Benedikt Schmatz
     */
    public double minus(double number1, double number2){
        logger.debug("Subtraction called with: " + number1 + " and " + number2);
        return number1 - number2;
    }

    /**
     * Divides number1 by number2 and returns the result.
     *
     * @param number1 The number that is to be divided
     * @param number2 The factor by which the first number should be divided
     * @return the quotient of the two numbers
     * @throws ArithmeticException if number2 is 0, because division by zero is not allowed
     * @author Benedikt Schmatz
     */
    public double divide(double number1, double number2){
        logger.debug("Division called with: " + number1 + " and " + number2);

        if (number2 == 0){
            logger.error("Division by zero is not allowed!");
            throw new ArithmeticException("Division by zero is not allowed!");
        }

        return number1 / number2;
    }

    /**
     * Multiplies number1 by number2 and returns the result.
     *
     * @param number1 First number to multiply
     * @param number2 Second number to multiply
     * @return the product of the two numbers
     * @author Beneidkt Schmatz
     */
    public double multiply(double number1, double number2){
        logger.debug("Multiplication called with: " + number1 + " and " + number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a number and returns the result.
     *
     * @param value The number of which the factorial should be calculated
     * @return the factorial of the number
     * @throws ArithmeticException if the number is negative, because factorial of negative numbers is not allowed
     * @author Benedikt Schmatz
     */
    public double factorial(double value) {
        logger.debug("Factorial called with: " + value);
        if (value < 0) {
            throw new ArithmeticException("Factorial of negative number is not allowed!");
        }

        if (value == 0) {
            return 1;
        }

        return value * factorial(value - 1);
    }
}
