package at.fhj.msd;

public class Calculator {

    public double add(double number1, double number2){
        return number1 + number2;
    }

    public double minus(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2){
        try {
            if (number2 == 0){
                throw new ArithmeticException("Division by zero is not allowed!");
            }
        } catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed!");
            System.out.println(e.getMessage());
        }

        return number1 / number2;
    }

    public double multiply(double number1, double number2){
        return number1 * number2;
    }
}
