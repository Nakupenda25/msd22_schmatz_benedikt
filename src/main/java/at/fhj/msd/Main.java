package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger();
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 2;

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2 + "\n");

        logger.info("This is an info message");

        System.out.println("Addition: " + calculator.add(number1, number2));
        System.out.println("Subtraction: " + calculator.minus(number1, number2));
        System.out.println("Division: " + calculator.divide(number1, number2));
        System.out.println("Multiplication: " + calculator.multiply(number1, number2));

        logger.error("This is an error message");
    }
}
