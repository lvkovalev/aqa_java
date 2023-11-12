package aqatest.lesson3;

public class task2 {
    public static void printStringMultipleTimes(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        String myString = "Hello world";
        int myCount = 10;
        printStringMultipleTimes(myString, myCount);
    }
}
