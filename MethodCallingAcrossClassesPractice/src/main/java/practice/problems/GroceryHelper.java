package practice.problems;

import java.util.ArrayList;

public class GroceryHelper {
    public static void printList(ArrayList<String> list){
        System.out.println("\nCurrent Grocery List: ");
        for (String item : list){
            System.out.println("- " + item);
        }
    }

    public static void sortAndPrint(ArrayList<String> list){
        list.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("\nSorted Grocery List: ");
        for (String item : list){
            System.out.println("- " + item);
        }
    }
}
