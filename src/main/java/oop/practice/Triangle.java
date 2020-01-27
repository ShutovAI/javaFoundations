package oop.practice;

public class Triangle extends Figure {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calcPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double calcSquare() {
        return Math.sqrt(calcPerimeter() / 2 * (calcPerimeter() / 2 - side1) * (calcPerimeter() / 2 - side2) * (calcPerimeter() / 2 - side3));
    }
    public void tri (){
        System.out.println("Метод Треугольника!");
    }
}
