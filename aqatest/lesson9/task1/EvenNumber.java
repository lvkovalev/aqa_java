package aqatest.lesson9.task1;

import java.util.Random;

public class EvenNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Количество четных чисел: " + count);

        System.out.println("Сгенерированные числа:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
