package aqatest.lesson8;

import java.util.*;

public class WordUnic {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi", "orange", "mango", "apple"};

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        System.out.println("Уникальные слова:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество повторений слов:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
