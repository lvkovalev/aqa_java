package aqatest.lesson3;

public class task4 {
    public static void main(String[] args) {
        int number = -7;

        boolean result = isNegative(number);
        System.out.println(result);
    }

    public static boolean isNegative(int number) {
        if (number < 0) {
            return true;
        } else {
            return false;
        }
    }
}
