package aqatest.lesson3;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int len = 6;
        int initialValue = 3;

        int[] result = createArray(len, initialValue);

        System.out.println(Arrays.toString((result)));
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}
