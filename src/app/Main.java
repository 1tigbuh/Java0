package app;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(2),
                new Triangle(5, 5),
                new Square(10)
        };

        double totalArea = calculateTotal(shapes);
        System.out.println("Total Area: " + totalArea);
    }

    public static double calculateTotal(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}