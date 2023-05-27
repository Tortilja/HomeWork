package io.codelex.oop.shapes;

public class ShapeApp {

        public static void main(String[] args) {
            // Create a rectangle
            Rectangle rectangle = new Rectangle(5, 3);
            System.out.println("Rectangle:");
            System.out.println("Number of sides: " + rectangle.getNumSides());
            System.out.println("Area: " + rectangle.getArea());
            System.out.println("Perimeter: " + rectangle.getPerimeter());

            System.out.println();

            // Create a triangle
            Triangle triangle = new Triangle(4, 6);
            System.out.println("Triangle:");
            System.out.println("Number of sides: " + triangle.getNumSides());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
        }
}
