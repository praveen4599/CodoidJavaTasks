import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        try {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integer value.");
            return;
        }

        System.out.print("Enter the operation (+, -, *, /): ");
        String operator = scanner.next();

        int result = 0;
        try {
            result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> {
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed");
                    }
                    yield num1 / num2;
                }
                default -> {
                    System.out.println("Invalid operator");
                    yield 0;
                }
            };
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
