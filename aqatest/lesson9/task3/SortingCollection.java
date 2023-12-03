package aqatest.lesson9.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCollection {
    public static void main(String[] args) {
        List<String> collection = new ArrayList<>(Arrays.asList("f10", "f15", "f2", "f4", "f4"));

        Collections.sort(collection);

        String[] sortedArray = collection.toArray(new String[0]);
        System.out.println(Arrays.toString(sortedArray));
    }
}
