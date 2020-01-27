package oop.practice;

public class FigureRunner {
    public static void main(String[] args) {
        Figure rect = new Rectangle(3, 4);

        System.out.println("Площадь прямоугольника = " + rect.calcSquare());
        System.out.println("Периметр прямоугольника = " + rect.calcPerimeter());

        Figure circle = new Circle(10);
        System.out.println("Площадь круга = " + circle.calcSquare());
        System.out.println("Длина окружности = " + circle.calcPerimeter());

        Figure triangle = new Triangle(4, 5, 6);
        System.out.println("Периметр треугольника = " + triangle.calcPerimeter());
        System.out.println("Площадь треугольника = " + triangle.calcSquare());

    }
}
