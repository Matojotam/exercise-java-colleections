package se.lexicon;

import java.util.ArrayList;

public class FindTheLargest {
    void main() {
        // 1. Create an ArrayList of numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(3);
        numbers.add(78);
        numbers.add(45);
        numbers.add(22);
        numbers.add(91);
        numbers.add(7);
        numbers.add(56);

        // 2. Assume the first number is the largest
        int largest = numbers.get(0);

        // 3. Loop through the list
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > largest) {
                largest = numbers.get(i);
            }
        }

        // 4. Print the largest number
        IO.println("The largest number is: " + largest);
    }
}
