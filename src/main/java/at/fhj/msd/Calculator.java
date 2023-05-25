package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2){

        if (number2 == 0){
            throw new ArithmeticException("Division by zero is not allowed!");
        }

        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        return number1 * number2;
    }

    public double factorial(double value) {
        if (value < 0) {
            throw new ArithmeticException("Factorial of negative number is not allowed!");
        }

        if (value == 0) {
            return 1;
        }

        return value * factorial(value - 1);
    }
}
