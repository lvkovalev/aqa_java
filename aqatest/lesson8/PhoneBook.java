package aqatest.lesson8;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        List<String> numbers = phoneBook.getOrDefault(lastName, new ArrayList<>());
        numbers.add(phoneNumber);
        phoneBook.put(lastName, numbers);
    }

    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneBook phoneDirectory = new PhoneBook();

        phoneDirectory.add("Kozlov", "375442342221");
        phoneDirectory.add("Ivanov", "375338829922");
        phoneDirectory.add("Kozlov", "375295887733");

        List<String> smithNumbers = phoneDirectory.get("Kozlov");
        System.out.println("Phone numbers for the surname Kozlov:");
        for (String number : smithNumbers) {
            System.out.println(number);
        }

        List<String> johnsonNumbers = phoneDirectory.get("Ivanov");
        System.out.println("Phone numbers for the surname Ivanov:");
        for (String number : johnsonNumbers) {
            System.out.println(number);
        }

        List<String> doeNumbers = phoneDirectory.get("Petrov"); // Фамилия, отсутствующая в справочнике
        System.out.println("Phone numbers for the surname Petrov:");
        for (String number : doeNumbers) {
            System.out.println(number);
        }
    }
}
