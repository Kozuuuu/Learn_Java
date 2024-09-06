import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            // Taking inputs from the user
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            // Choosing operation
            System.out.println("Choose operation: +, -, *, /");
            char operation = scanner.next().charAt(0);

            double result = 0;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    continue;
            }

            // Displaying result
            System.out.println("The result is: " + result);

            // Asking if the user wants to continue
            System.out.print("Do you want to make another calculation? (yes/no): ");
            String response = scanner.next();
            continueCalculation = response.equalsIgnoreCase("yes");
        }

        // Closing scanner after use
        scanner.close();
        System.out.println("Calculator closed.");
    }
}
