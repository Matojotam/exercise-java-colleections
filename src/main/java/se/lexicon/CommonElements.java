package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonElements {
    void main() {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);
        listA.add(7);
        listA.add(9);
        listA.add(11);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(6);
        listB.add(9);
        listB.add(12);
        listB.add(15);

        HashSet<Integer> setB = new HashSet<>(listB);
        HashSet<Integer> common = new HashSet<>();

        for (int number : listA) {
            if (setB.contains(number)) {
                common.add(number);
            }
        }

        IO.println("Common elements: " + common);
    }
}
