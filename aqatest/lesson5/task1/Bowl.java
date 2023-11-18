package aqatest.lesson5;

public class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = Math.max(foodAmount, 0);
    }

    public void addFood(int amount) {
        foodAmount += Math.max(amount, 0);
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
