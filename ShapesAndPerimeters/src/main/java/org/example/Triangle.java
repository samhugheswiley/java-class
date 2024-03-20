package org.example;

public class Triangle extends Shape {
    private double base;
    private double height;
    private double sideA;
    private double sideB;

    public Triangle(double base, double height, double sideA, double sideB) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return base + sideA + sideB;
    }
}
