package org.example;

public class Rectangle extends Figure{
    private double length;
    private double height;
    public Rectangle(double length, double height){
        this.length = length;
        this.height = height;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + height);
    }

    @Override
    public double calculateSquare() {
        return length * height;
    }
}
