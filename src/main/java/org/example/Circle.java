package org.example;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius){

        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
    return 2 * Math.PI * radius;
    }

    @Override
    public double calculateSquare() {
        return Math.PI * radius * radius;
    }
}
