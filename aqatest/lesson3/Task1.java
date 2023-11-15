package aqatest.lesson3;

public class Task1 {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;

        boolean result = checkSumInRange(num1, num2);
        System.out.println(result);
    }

    public static boolean checkSumInRange(int num1, int num2) {
        int sum = num1 + num2;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
