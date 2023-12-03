package aqatest.lesson10;

public class TransferFruit {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        System.out.println("Weight of appleBox1: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2: " + appleBox2.getWeight());
        System.out.println("Weight of orangeBox: " + orangeBox.getWeight());

        System.out.println("Comparison of appleBox1 and appleBox2: " + appleBox1.compare(appleBox2));
        System.out.println("Comparison of appleBox1 and orangeBox: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruits(appleBox2);

        System.out.println("Weight of appleBox1 after transfer: " + appleBox1.getWeight());
        System.out.println("Weight of appleBox2 after transfer: " + appleBox2.getWeight());
    }
}
