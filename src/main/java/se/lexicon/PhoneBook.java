package se.lexicon;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {

    void main() {

        HashMap<String, String> phoneBook = new HashMap<>();


        phoneBook.put("Carl", "070-123-4567");
        phoneBook.put("Michael", "070-234-5678");
        phoneBook.put("Poa", "070-345-6789");
        phoneBook.put("August", "070-456-7890");


        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a name: ");
        String name = scanner.nextLine();


        if (phoneBook.containsKey(name)) {
            IO.println(phoneBook.get(name));
        } else {
            IO.println("Contact not found.");
        }

        scanner.close();
    }

}
