package com.company;

/**
 * @Author Fil
 * @create 2022-04-01 12:54
 **/

public class Circle extends Figure{
    public static final String name = "Circle";
    private double radius;
    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    @Override
    double getArea() {
        return (Math.PI * Math.pow(radius ,2));
    }

    @Override
    double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    public static String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

}
