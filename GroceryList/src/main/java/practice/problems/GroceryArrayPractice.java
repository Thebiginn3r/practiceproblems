package practice.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryArrayPractice {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a grocery item: ");
            String item = scanner.nextLine();
            groceries.add(item);
        }

        System.out.println("Your grocery list: ");
        for (String item : groceries){
            System.out.println("- " + item);
        }

        System.out.print("\nEnter item you would like to remove: ");
        String itemremove = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < groceries.size(); i++) {
            if(groceries.get(i).equalsIgnoreCase(itemremove)){
                groceries.remove(i);
                found = true;
                System.out.println(itemremove.toLowerCase() + " removed");
                break;
            }
        }
       if (!found){
               System.out.println("Item not found on the list");
       }

        System.out.println("\nUpdated list: ");
        for (String item : groceries){
            System.out.println("- " + item);

        }

        scanner.close();

//        groceries.add("blueberries");
//        groceries.add("corn flakes");
//        groceries.add("bread");

       // System.out.println(groceries);
    }
}
