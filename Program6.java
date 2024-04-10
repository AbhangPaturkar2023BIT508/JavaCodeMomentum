import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0.0;
        }
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        double a, b;
        int choice;

        do {
            System.out.print("Enter value for 'a': ");
            a = scanner.nextDouble();
            System.out.print("Enter value for 'b': ");
            b = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            double result;

            switch (choice) {
                case 1:
                    result = calculator.add(a, b);
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = calculator.subtract(a, b);
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = calculator.multiply(a, b);
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    result = calculator.divide(a, b);
                    if (result != 0.0) {
                        System.out.println("Result: " + result);
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    break;
            }
        } while (choice != 5);
    }
}
