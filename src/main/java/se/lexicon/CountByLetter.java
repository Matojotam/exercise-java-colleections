package se.lexicon;


import java.util.ArrayList;
import java.util.Scanner;


public class CountByLetter {

    void main() {
        // 1. Create a list of names
        ArrayList<String> names = new ArrayList<>();

        names.add("Anna");
        names.add("Bob");
        names.add("Alice");
        names.add("Charlie");
        names.add("Amanda");
        names.add("David");
        names.add("Amy");
        names.add("Brian");


        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a letter: ");
        String letter = scanner.nextLine();


        int count = 0;

        for (String name : names) {
            if (name.toLowerCase().startsWith(letter.toLowerCase())) {
                count++;
            }
        }


        IO.println("Number of names starting with " + letter + ": " + count);

        scanner.close();
    }

}
