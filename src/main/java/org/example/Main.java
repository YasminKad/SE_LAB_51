package org.example;

import calculator.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a value for a: ");
            int a = (int) scanner.nextDouble();

            System.out.print("Enter a value for b: ");
            int b = (int) scanner.nextDouble();

            Calculator calculator = new Calculator();
            int result = calculator.calculateResult(a, b);

            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid values for a and b.");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero is not allowed.");
        }
    }}