package aqatest.lesson3;

public class Task5 {
    public static void main(String[] args) {
        int year = 2012;

        boolean result = isLeapYear(year);
        System.out.println(result);
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return false;
        }
    }
}
