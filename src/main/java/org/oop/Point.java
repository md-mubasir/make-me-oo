package org.oop;

public class Point implements DistanceAndDirectionCalculator{
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceFrom(Point from) {
        double xDistance = from.x - x;
        double yDistance = from.y - y;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public double directionFrom(Point from) {
        double xDistance = from.x - x;
        double yDistance = from.y - y;
        return Math.atan2(yDistance, xDistance);
    }
}
