package io.codelex.arithmetic.practice;

class Geometry {
    static double areaOfCircle(double radius) {
        return Math.PI * (radius * radius);
    }

    static double areaOfRectangle(double length, double width) {
        return width * length;
    }

    static double areaOfTriangle(double base, double height) {
        return (height * base) / 2;
    }
}
