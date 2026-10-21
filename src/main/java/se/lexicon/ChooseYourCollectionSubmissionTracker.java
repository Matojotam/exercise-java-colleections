package se.lexicon;

import java.util.HashSet;

public class ChooseYourCollectionSubmissionTracker {
    void main() {
        /*
         Hashset, since it doesn't allow duplicates and the order doesn't matter.

         */

        HashSet<String> submissions = new HashSet<>();

        String[] students = {
                "Carl", "Michael", "August", "Per",
                "Michael", "Carina", "Linea", "Kerstin",
                "Ida", "Carl"
        };

        for (String student : students) {
            if (submissions.add(student)) {
                IO.println(student + " submitted successfully.");
            } else {
                IO.println("Rejected: " + student + " has already submitted.");
            }
        }

        IO.println("\nAll submitted students:");

        for (String student : submissions) {
            IO.println(student);
        }
    }
}
