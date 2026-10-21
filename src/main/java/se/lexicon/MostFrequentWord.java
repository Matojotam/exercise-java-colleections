package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {
    void main() {
        ArrayList<String> words = new ArrayList<>();

        words.add("cat");
        words.add("dog");
        words.add("cat");
        words.add("bird");
        words.add("dog");
        words.add("cat");
        words.add("fish");
        words.add("dog");
        words.add("dog");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        String mostFrequent = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequent = entry.getKey();
                highestCount = entry.getValue();
            }
        }

        IO.println("Most frequent word: " + mostFrequent);
        IO.println("Count: " + highestCount);
    }
}
