package io.codelex.oop.shapesNr9Nr10;


public class Cone extends _3DShape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double calculateVolume() {
        return (Math.PI * radius * radius * height) / 3;
    }
}