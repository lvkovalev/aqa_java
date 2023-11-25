package aqatest.lesson3;

public class Task4 {
    public static void main(String[] args) {

        boolean result = isNegative(-7);
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
