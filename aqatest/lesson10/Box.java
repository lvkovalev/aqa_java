package aqatest.lesson10;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weight = fruits.get(0).getWeight() * fruits.size();
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(this.getWeight() - otherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> otherBox) {
        if (this == otherBox) {
            return;
        }

        if (fruits.isEmpty()) {
            return;
        }

        if (!otherBox.getFruits().isEmpty()) {
            if (fruits.get(0).getClass() != otherBox.getFruits().get(0).getClass()) {
                return;
            }
        }

        otherBox.getFruits().addAll(this.fruits);
        this.fruits.clear();
    }
}
