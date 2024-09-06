import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {{

        Scanner input= new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double div = num1 / num2;

        System.out.println();
        System.out.println("The result is: " + div);
    }}
}