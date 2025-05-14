package practice.problems;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = multiply(4,5);
        System.out.println(result);
        String name = greet("Tony");
        String name2 = greet2("AIB");
        System.out.println(name2);
        double area = calculateArea(5.5, 8.2);
        System.out.println(area);
        double volume = calculateVolume();
        System.out.println(volume);

    }

    public static int multiply(int x, int y){
        return x * y;
    }

    public static String greet(String name){
        System.out.println("Hello " + name + "! Welcome to Java training");
        return name;
    }

    public static String greet2(String name){
        return "Hello " + name + "! Welcome to Java training";
    }

    public static double calculateArea(double length, double width){
        return length * width;
    }

    public static double calculateVolume(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        return calculateArea(length, width) * height;
    }
}
