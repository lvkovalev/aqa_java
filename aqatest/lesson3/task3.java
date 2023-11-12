package aqatest.lesson3;

public class task3 {
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + " является положительным");
        } else {
            System.out.println("Число " + number + " является отрицательным");
        }
    }

    public static void main(String[] args) {
        int myNumber = 1;
        printNumberSign(myNumber);
    }
}
