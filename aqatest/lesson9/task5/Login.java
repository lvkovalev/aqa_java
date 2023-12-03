package aqatest.lesson9.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        List<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите логин (или пустую строку для завершения): ");
            String login = scanner.nextLine();

            if (login.isEmpty()) {
                break;
            }

            logins.add(login);
        }

        System.out.println("Логины, начинающиеся на 'f':");
        for (String login : logins) {
            if (login.startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}
