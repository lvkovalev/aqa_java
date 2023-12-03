package aqatest.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private List<Attraction> attractions;

    public Park() {
        attractions = new ArrayList<>();
    }

    public void addAttraction(String name, String openingTime, String closingTime, double cost) {
        Attraction attraction = new Attraction(name, openingTime, closingTime, cost);
        attractions.add(attraction);
    }

    public void displayAttractions() {
        for (Attraction attraction : attractions) {
            System.out.println("Attractions: " + attraction.getName());
            System.out.println("Work time: " + attraction.getOpeningTime() + " - " + attraction.getClosingTime());
            System.out.println("Cost: " + attraction.getCost());
            System.out.println();
        }
    }

    private class Attraction {
        private String name;
        private String openingTime;
        private String closingTime;
        private double cost;

        public Attraction(String name, String openingTime, String closingTime, double cost) {
            this.name = name;
            this.openingTime = openingTime;
            this.closingTime = closingTime;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public String getClosingTime() {
            return closingTime;
        }

        public double getCost() {
            return cost;
        }
    }
}
