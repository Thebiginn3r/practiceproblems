package practice.problems;

import java.util.Scanner;

public class AdvancedCalculator {
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
                System.out.println("Result: " + add(num1, num2));
                break;
            case "-":
                System.out.println("Result: " + subtract(num1,num2));
                break;
            case "x":
                System.out.println("Result: " + multiply(num1,num2));
                break;
            case "/":
                while (num2 == 0) {
                    System.out.println("You can't divide by zero.");
                    System.out.print("Enter your second number: ");
                    num2 = scanner.nextDouble();
                }
                System.out.println("Result: " + divide(num1, num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
        scanner.close();


    }
    public static double add(double a, double b){
        return a+b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double multiply(double a, double b){
        return a*b;
    }

    public static double divide(double a, double b){
        return a/b;
    }
}

