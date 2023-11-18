package aqatest.lesson5.task2;

public class PrintInfoFigures {
    public static void main(String[] args) {
        Shape circle = new Circle(6.0, "Red", "Black");
        Shape rectangle = new Rectangle(4.0, 5.0, "Blue", "Green");
        Shape triangle = new Triangle(4.0, 5.0, 6.0, "Yellow", "Purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    public static void printShapeInfo(Shape shape) {
        System.out.println("Shape Type: " + shape.getClass().getSimpleName());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Fill Color: " + shape.getFillColor());
        System.out.println("Border Color: " + shape.getBorderColor());
        System.out.println();
    }
}
