package se.lexicon;

import java.util.ArrayList;

public class ShoppingList {
    static void main() {

        ArrayList<String> shoppingList = new ArrayList<>();


        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Apples");
        shoppingList.add("Cheese");

        IO.println("Shopping List:");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println((i + 1) + ". " + shoppingList.get(i));
        }

        shoppingList.remove("Eggs");

        IO.println("Updated shopping list");

        for (int i = 0; i < shoppingList.size(); i++) {
            IO.println((i + 1) + ". " + shoppingList.get(i));

        }
    }
}
