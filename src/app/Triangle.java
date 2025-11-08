package app;

public class Triangle implements Shape {
    private double base;
    private double h;

    public Triangle(double base, double h) {
        this.base = base;
        this.h = h;
    }
    @Override
    public double getArea() {
        return 0.5 * base * h;
    }
}