package aqatest.lesson5.task1;

import aqatest.lesson5.task1.Animals;

public class Cat extends Animals {
    private boolean isHungry;

    public Cat(String name) {
        super(name, 200, 0);
        isHungry = true;
    }

    public void eat(int foodAmount) {
        if (isHungry && foodAmount >= 0) {
            isHungry = false;
            System.out.println(name + " ate.");
        } else {
            System.out.println(name + " not hungry or not enough food in the bowl.");
        }
    }

    @Override
    public void run(int distance) {
        if (distance <= runLimit) {
            System.out.println(name + " ran " + distance + " м.");
        } else {
            System.out.println(name + " can't run " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " can't swim.");
    }

}
