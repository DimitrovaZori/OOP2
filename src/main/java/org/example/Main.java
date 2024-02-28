package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Figure square = new Square(4);
        double area = square.calculateSquare();
        System.out.println("Area square is :" + area);
       double perimeter = square.calculatePerimeter();
        System.out.println("Perimeter square is: "+ perimeter);

        Figure circle = new Circle(6);
        double areaCircle = circle.calculateSquare();
        System.out.println("Area circle is :" + areaCircle);
        double perimeterCircle = circle.calculatePerimeter();
        System.out.println("Perimeter circle is: "+ perimeterCircle);

        Figure rectangle = new Rectangle(5 , 6);
        double areaRectangle = rectangle.calculateSquare();
        System.out.println("Area is :" + areaRectangle);
        double perimeterRectangle = rectangle.calculatePerimeter();
        System.out.println("Perimeter is: "+ perimeterRectangle);
    }
}