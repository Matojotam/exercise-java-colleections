package se.lexicon;

import java.util.ArrayList;

public class SecondLargest {
    void main() {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(78);
        numbers.add(23);
        numbers.add(78);
        numbers.add(91);
        numbers.add(56);
        numbers.add(91);
        numbers.add(12);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            IO.println("There is no second largest unique value.");
        } else {
            IO.println("Second largest unique value: " + secondLargest);
        }
    }
}
