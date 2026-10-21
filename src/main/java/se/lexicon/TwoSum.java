package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class TwoSum {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(7);
        numbers.add(11);
        numbers.add(15);
        numbers.add(4);
        numbers.add(6);

        int target = 13;

        HashSet<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            int needed = target - number;

            if (seen.contains(needed)) {
                IO.println("Numbers: " + needed + " and " + number);
                break;
            }

            seen.add(number);
        }
    }
}
