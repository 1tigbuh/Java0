package app;

public class Square implements Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }
    @Override
    public double getArea() {
        return a * a;
    }
}