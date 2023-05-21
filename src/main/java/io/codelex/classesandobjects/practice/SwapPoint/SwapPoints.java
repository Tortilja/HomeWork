package io.codelex.classesandobjects.practice.SwapPoint;

public class SwapPoints {
    public static void swapPoints(Point p1, Point p2) {
        int tempX = p1.x;
        int tempY = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = tempX;
        p2.y = tempY;
    }
}
