package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesKeepOrder {
    void main() {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);


        HashSet<Integer> seen = new HashSet<>();


        ArrayList<Integer> uniqueNumbers = new ArrayList<>();


        for (int number : numbers) {
            if (seen.add(number)) {
                uniqueNumbers.add(number);
            }
        }


        IO.println("Unique numbers: " + uniqueNumbers);
    }
}
