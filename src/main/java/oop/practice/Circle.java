package oop.practice;

public class Circle extends Figure {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

//    L = 2piR
//    S = 2pir^2

    public double calcSquare() {
        return 2 * PI * radius * radius;
    }

    public double calcPerimeter() {
        return 2 * PI * radius;
    }
}