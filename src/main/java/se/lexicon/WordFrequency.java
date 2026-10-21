package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class WordFrequency {
    void main() {
        // 1. Create a list of words
        ArrayList<String> words = new ArrayList<>();

        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");
        words.add("grape");
        words.add("orange");


        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1);
            }
        }


        TreeMap<String, Integer> sortedFrequency =
                new TreeMap<>(frequency);


        for (String word : sortedFrequency.keySet()) {
            IO.println(word + ": " + sortedFrequency.get(word));
        }
    }
}
