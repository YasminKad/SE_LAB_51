package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a value for a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter a value for b: ");
            double b = scanner.nextDouble();

            double result = calculateResult(a, b);

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid values for a and b.");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero is not allowed.");
        }
    }

    private static double calculateResult(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double rawResult = Math.sqrt(a / b);
        return Math.round(rawResult * 1000.0) / 1000.0;
    }
}
