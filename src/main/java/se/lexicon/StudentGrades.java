package se.lexicon;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class StudentGrades {
    void main() {
        /*
         Hashmap is best because you can store each student's name with their grade making it easier to look up
         */

        HashMap<String, Integer> grades = new HashMap<>();

        grades.put("Anna", 85);
        grades.put("Bob", 72);
        grades.put("Charlie", 93);
        grades.put("Diana", 68);
        grades.put("Erik", 97);
        grades.put("Fatima", 81);

        IO.println("Charlie's grade: " + grades.get("Charlie"));

        ArrayList<Map.Entry<String, Integer>> sortedGrades =
                new ArrayList<>(grades.entrySet());

        sortedGrades.sort(
                (student1, student2) ->
                        Integer.compare(student2.getValue(), student1.getValue())
        );

        IO.println("\nStudents sorted by grade:");

        for (Map.Entry<String, Integer> student : sortedGrades) {
            IO.println(student.getKey() + ": " + student.getValue());
        }
    }
}
