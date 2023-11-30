package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public int calculateResult(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        double rawResult = Math.sqrt(a / b);
        return (int) (Math.round(rawResult * 1000.0) / 1000.0);
    }
}
