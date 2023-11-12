package aqatest.lesson3;

public class task11 {
    public static void main(String[] args) {
        int len = 6;
        int initialValue = 3;

        int[] result = createArray(len, initialValue);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }

        return array;
    }
}
