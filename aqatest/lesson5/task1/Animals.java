package aqatest.lesson5.task1;

public abstract class Animals {
    protected String name;
    protected int runLimit;
    protected int swimLimit;

    protected static int animalCount = 0;

    public Animals(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getAnimalCount() {
        return animalCount;
    }
}
