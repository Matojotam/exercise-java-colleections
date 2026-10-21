package se.lexicon;

import java.util.HashMap;
import java.util.Scanner;


public class PhoneBook {

    void main() {
        // 1. Create a phone book
        HashMap<String, String> phoneBook = new HashMap<>();

        // 2. Add at least 4 contacts
        phoneBook.put("Carl", "070-123-4567");
        phoneBook.put("Michael", "070-234-5678");
        phoneBook.put("Poa", "070-345-6789");
        phoneBook.put("August", "070-456-7890");

        // 3. Ask the user for a name
        Scanner scanner = new Scanner(System.in);

        IO.print("Enter a name: ");
        String name = scanner.nextLine();

        // 4. Look up the contact
        if (phoneBook.containsKey(name)) {
            IO.println(phoneBook.get(name));
        } else {
            IO.println("Contact not found.");
        }

        scanner.close();
    }

}
