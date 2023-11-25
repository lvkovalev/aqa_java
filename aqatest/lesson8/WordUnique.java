package aqatest.lesson8;

import java.util.*;

public class WordUnique {
    public static void main(String[] args) {
        String[] words = {"telephone", "book", "sandwich", "telephone", "map", "book", "human", "sandwich", "car", "telephone"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Number of word repetitions:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
