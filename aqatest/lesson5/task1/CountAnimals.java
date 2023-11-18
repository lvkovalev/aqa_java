package aqatest.lesson5.task1;

public class CountAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog("Cooper");
        dog.run(300);
        dog.swim(5);

        Cat cat = new Cat("Chip");
        cat.run(100);
        cat.swim(10);
        cat.eat(10);

        System.out.println("Number of animals: " + Animals.getAnimalCount());

        Bowl bowl = new Bowl(20);

        Cat[] cats = {
                new Cat("Casper"),
                new Cat("Alvin "),
                new Cat("Damian")
        };

        for (Cat currentCat : cats) {
            currentCat.eat(bowl.getFoodAmount());
        }

        System.out.println("Number of animals: " + Animals.getAnimalCount());

        bowl.addFood(30);

        for (Cat currentCat : cats) {
            currentCat.eat(bowl.getFoodAmount());
        }
    }
}
