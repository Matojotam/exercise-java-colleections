package se.lexicon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TopThreeMostFrequent {
    void main() {
        ArrayList<String> words = new ArrayList<>();

        words.add("java");
        words.add("python");
        words.add("java");
        words.add("c++");
        words.add("python");
        words.add("java");
        words.add("ruby");
        words.add("c++");
        words.add("python");
        words.add("ruby");
        words.add("java");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word, frequency.getOrDefault(word, 0) + 1);
        }

        ArrayList<Map.Entry<String, Integer>> sortedWords =
                new ArrayList<>(frequency.entrySet());

        sortedWords.sort(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
        );

        IO.println("Top 3 most frequent words:");

        for (int i = 0; i < 3 && i < sortedWords.size(); i++) {
            Map.Entry<String, Integer> entry = sortedWords.get(i);
            IO.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
