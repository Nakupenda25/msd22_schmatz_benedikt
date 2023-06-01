package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger("");

    public double add(double number1, double number2){
        logger.debug("Addition called with: " + number1 + " and " + number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        logger.debug("Subtraction called with: " + number1 + " and " + number2);
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        logger.debug("Division called with: " + number1 + " and " + number2);

        if (number2 == 0){
            logger.error("Division by zero is not allowed!");
            throw new ArithmeticException("Division by zero is not allowed!");
        }

        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        logger.debug("Multiplication called with: " + number1 + " and " + number2);
        return number1 * number2;
    }

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
