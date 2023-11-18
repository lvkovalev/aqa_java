package aqatest.lesson4;

public class ListAttractions {
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("Adrenalin", "10:00", "18:00", 10);
        park.addAttraction("Roller coaster", "12:00", "20:00", 20);
        park.addAttraction("Ferris wheel", "11:00", "21:00", 15);

        park.displayAttractions();
    }
}
