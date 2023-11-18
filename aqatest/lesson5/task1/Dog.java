package aqatest.lesson5;

public class Dog extends Animals {
    public Dog(String name) {
        super(name, 500, 10);
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
        if (distance <= swimLimit) {
            System.out.println(name + " swam " + distance + " м.");
        } else {
            System.out.println(name + " can't swim " + distance + " м.");
        }
    }
}
