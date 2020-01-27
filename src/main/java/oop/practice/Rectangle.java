package oop.practice;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calcSquare() {
        return length * width;
    }

    @Override
    public double calcPerimeter() {
        return (length + width) * 2;
    }

}
