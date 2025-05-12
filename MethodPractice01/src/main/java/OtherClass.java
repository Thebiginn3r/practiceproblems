import java.util.Scanner;

public class OtherClass {
    public static void method1(){
        System.out.println("This is the first practice on how you call a method in another class");
    }

    public static void method2(String name){
        System.out.println("The users name is " + name);
    }

    public static void method3(int age){
        System.out.println("The user is " + age + " years old");
    }

    public static int  method4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How tall are you in inches?: ");
        int height = scanner.nextInt();
        System.out.println("You are " + height + " inches tall");
        return height;
    }

    public static boolean method5(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("type y or n: ");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("y")) {
            System.out.println("true");
            return true;
        }else{
            System.out.println("false");
            return false;
        }

    }

    public static MethodCallingPractice method6(String name, int Age){
        MethodCallingPractice person = new MethodCallingPractice("Tony", 26);
        String myProfile = person.getName();
        System.out.println("The players name is " + myProfile);
        return person;
    }
}
