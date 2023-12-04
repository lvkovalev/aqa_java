package aqatest.lesson9.task4;

import java.time.Year;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CollectionStudent {
    public static void main(String[] args) {
        Collection<Student> students = Arrays.asList(
                new Student("Дмитрий", 17, Gender.MAN),
                new Student("Максим", 20, Gender.MAN),
                new Student("Екатерина", 20, Gender.WOMAN),
                new Student("Михаил", 28, Gender.MAN)
        );

        int sumAge = 0;
        int count = 0;

        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                sumAge += student.getAge();
                count++;
            }
        }

        double averageAge = (double) sumAge / count;
        System.out.println("Средний возраст студентов мужского пола: " + averageAge);

        int currentYear = Year.now().getValue();
        int conscriptionAgeMin = 18;
        int conscriptionAgeMax = 27;

        for (Student student : students) {
            if (student.getGender() == Gender.MAN) {
                int yearOfBirth = currentYear - student.getAge();
                int conscriptionYearMin = yearOfBirth + conscriptionAgeMin;
                int conscriptionYearMax = yearOfBirth + conscriptionAgeMax;

                if (conscriptionYearMin <= currentYear && currentYear <= conscriptionYearMax) {
                    System.out.println("Студент " + student.getName() + " грозит получение повестки в этом году.");
                }
            }
        }
    }

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, gender);
        }
    }
}
