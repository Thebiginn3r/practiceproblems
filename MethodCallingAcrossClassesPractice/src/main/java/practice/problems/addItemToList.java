package practice.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class addItemToList {
    public static void addItemToList2(ArrayList<String> list){
        Scanner scanner = new Scanner(System.in);
        boolean keepAdding = true;
        while(keepAdding) {
            System.out.print("Enter the item you would like to add: ");
            String item = scanner.nextLine();
            list.add(item);
            System.out.print("Would you like add another item? (y/n): ");
            String cont = scanner.nextLine();
            if (cont.equalsIgnoreCase("n")) {
                keepAdding = false;
            }
        }
        scanner.close();
            //System.out.println("\nAdded \"" + item + "\" to the grocery list");
    }
}
