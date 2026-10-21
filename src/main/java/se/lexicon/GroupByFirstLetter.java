package se.lexicon;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class GroupByFirstLetter {
    void main() {
        ArrayList<String> names = new ArrayList<>();

        names.add("Michael");
        names.add("Per");
        names.add("Carina");
        names.add("Linnea");
        names.add("Kent");
        names.add("Mia");
        names.add("Carl");

        TreeMap<Character, ArrayList<String>> groups = new TreeMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);

            if (!groups.containsKey(firstLetter)) {
                groups.put(firstLetter, new ArrayList<>());
            }

            groups.get(firstLetter).add(name);
        }

        for (Map.Entry<Character, ArrayList<String>> group : groups.entrySet()) {
            IO.println(group.getKey() + ": " + group.getValue());
        }
    }
}
