package aqatest.lesson9.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>(Arrays.asList("Highload", "High", "Load", "Highload"));

        int countHigh = 0;
        for (String str : collection) {
            if (str.equals("High")) {
                countHigh++;
            }
        }
        System.out.println("Количество вхождений 'High': " + countHigh);

        String firstElement = collection.isEmpty() ? "0" : collection.get(0);
        System.out.println("Первый элемент коллекции: " + firstElement);

        String lastElement = collection.isEmpty() ? "0" : collection.get(collection.size() - 1);
        System.out.println("Последний элемент коллекции: " + lastElement);
    }
}
