package com.company;

/**
 * @Author Fil
 * @create 2022-04-01 13:14
 **/

public class Rectangle extends Figure{
    public static final String name = "Rectangle";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return (width * 2 + height * 2);
    }

    public static String getName() {
        return name;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
