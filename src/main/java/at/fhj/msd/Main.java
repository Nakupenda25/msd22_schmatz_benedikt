package at.fhj.msd;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int number1 = 5;
        int number2 = 2;

        System.out.println("Number 1 = " + number1);
        System.out.println("Number 2 = " + number2 + "\n");

        System.out.println("Addition: " + calculator.add(number1, number2));
        System.out.println("Subtraction: " + calculator.minus(number1, number2));
        System.out.println("Division: " + calculator.divide(number1, number2));
        System.out.println("Multiplication: " + calculator.multiply(number1, number2));
    }
}
