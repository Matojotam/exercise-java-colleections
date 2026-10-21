package se.lexicon;

import java.util.HashSet;

public class UniqueCities {


    void main() {
        // 1. Create a HashSet and add the cities
        HashSet<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        // 2. Print all unique cities
        IO.println("Unique cities:");

        for (String city : cities) {
            IO.println(city);
        }

        // 3. Print the total count
        IO.println("Total unique cities: " + cities.size());
    }

}
