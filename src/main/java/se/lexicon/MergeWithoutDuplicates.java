package se.lexicon;

import java.util.ArrayList;
import java.util.HashSet;

public class MergeWithoutDuplicates {
    void main() {
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);

        HashSet<Integer> merged = new HashSet<>();

        merged.addAll(listA);
        merged.addAll(listB);

        IO.println("Merged collection: " + merged);
        IO.println("Total count: " + merged.size());
    }
}
