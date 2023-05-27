package io.codelex.oop.shapesNr9Nr10;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(3, 4, 5);
        Hexagon hexagon = new Hexagon(6);
        Cone cone = new Cone(3, 5);
        Cube cube = new Cube(4);

        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
        System.out.println("Triangle Area: " + triangle.calculateArea());

        System.out.println("Hexagon Perimeter: " + hexagon.calculatePerimeter());
        System.out.println("Hexagon Area: " + hexagon.calculateArea());

        System.out.println("Cone Area: " + cone.calculateArea());
        System.out.println("Cone Volume: " + cone.calculateVolume());

        System.out.println("Cube Area: " + cube.calculateArea());
        System.out.println("Cube Volume: " + cube.calculateVolume());
    }
}