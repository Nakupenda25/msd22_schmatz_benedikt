package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        System.out.println("Setup complete:");
    }

    @Test
    public void add() {
        double number1 = 11;
        double number2 = 25;

        double result = calculator.add(number1, number2);
        assertEquals(36, result);

        System.out.println("Addition: " + number1 + " + " + number2 + " = " + result + "\n");
    }

    @Test
    public void addOverMax() {
        double number1 = Double.MAX_VALUE;
        double number2 = 123321;

        double result = calculator.add(number1, number2);
        assertEquals(Double.MAX_VALUE, result);

        System.out.println("Addition: " + number1 + " + " + number2 + " = " + result + "\n");
    }

    @Test
    public void addWithNegativeNumbers() {
        double number1 = 31;
        double number2 = -25;

        double result = calculator.add(number1, number2);
        assertEquals(6, result);

        System.out.println("Addition: " + number1 + " + " + number2 + " = " + result + "\n");
    }

    @Test
    public void subtract() {
        double number1 = 25;
        double number2 = 11;

        double result = calculator.minus(number1, number2);
        assertEquals(14, result);

        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + result + "\n");
    }

    @Test
    public void subtractWithNegativeNumbers() {
        double number1 = -12;
        double number2 = -131;

        double result = calculator.minus(number1, number2);
        assertEquals(119, result);

        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + result + "\n");
    }

    @Test void subtractWithNegativeResult() {
        double number1 = 11;
        double number2 = 25;

        double result = calculator.minus(number1, number2);
        assertEquals(-14, result);

        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + result + "\n");
    }

    @Test
    public void multiply() {
        double number1 = 212;
        double number2 = 4;

        double result = calculator.multiply(number1, number2);
        assertEquals(848, result);

        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + result + "\n");
    }

    @Test
    public void multiplyWithNegativeNumbers() {
        double number1 = -212;
        double number2 = 4;

        double result = calculator.multiply(number1, number2);
        assertEquals(-848, result);

        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + result + "\n");
    }

    @Test
    public void multiplyWithZero() {
        double number1 = 212;
        double number2 = 0;

        double result = calculator.multiply(number1, number2);
        assertEquals(0, result);

        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + result + "\n");
    }

    @Test
    public void divide() {
        double number1 = 123;
        double number2 = 41;

        double result = calculator.divide(number1, number2);
        assertEquals(3, result);

        System.out.println("Division: " + number1 + " / " + number2 + " = " + result + "\n" );
    }

    @Test
    public void divideByZero(){
        double number1 = 123;
        double number2 = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(number1, number2);
        });

        System.out.println("Division: " + number1 + " / " + number2 + " = " + "ArithmeticException" + "\n");
    }

    @Test
    public void divideSmallByBig(){
        double number1 = 2;
        double number2 = 123;

        double result = calculator.divide(number1, number2);
        assertEquals(0.016260162601626018, result);

        System.out.println("Division: " + number1 + " / " + number2 + " = " + result + "\n");
    }
}
