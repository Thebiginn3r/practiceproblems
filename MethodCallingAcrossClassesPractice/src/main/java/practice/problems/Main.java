package practice.problems;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        groceries.add("Bread");
        groceries.add("Apples");
        groceries.add("Corn Flakes");

        GroceryHelper.printList(groceries);

        GroceryHelper.sortAndPrint(groceries);

        addItemToList.addItemToList2(groceries);

        GroceryHelper.sortAndPrint(groceries);
    }
}
