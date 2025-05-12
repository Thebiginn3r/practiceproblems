package practice.problems;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPracticeApp {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What name would you like to add?");
        String nameInput = scanner.nextLine();

        names.add("Tony");
        names.add("Savante the biggest back");
        names.add("Charles");
        names.add(nameInput);

        while (nameInput == "") {
            nameInput = scanner.nextLine();
            return;
        }

        System.out.println("The second name is: " + names.get(1));

        System.out.println("All names: ");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
