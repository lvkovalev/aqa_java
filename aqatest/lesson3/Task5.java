package aqatest.lesson3;

public class Task5 {
    public static void main(String[] args) {
        boolean result = isLeapYear(100);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }
}
