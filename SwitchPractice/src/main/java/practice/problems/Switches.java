package practice.problems;

import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, x, /): ");
        String operation = scanner.next();

        switch (operation){
            case "+":
                System.out.println("Result: " + (num1 + num2));
                break;
            case "-":
                System.out.println("Result: " + (num1 - num2));
                break;
            case "x":
                System.out.println("Result: " + (num1 * num2));
                break;
            case "/":
                while (num2 == 0){
                    System.out.println("You cant divide by zero");
                    System.out.print("Enter your second number: ");
                    num2 = scanner.nextDouble();
                }
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
        scanner.close();
    }
}
