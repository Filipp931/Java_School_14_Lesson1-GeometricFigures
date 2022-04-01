package com.company;

/**
 * @Author Fil
 * @create 2022-04-01 13:26
 **/

public class Square extends Figure{
    public static final String name = "Square";
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return Math.pow(side,2);
    }

    @Override
    double getPerimeter() {
        return Math.pow(side,4);
    }

    public static String getName() {
        return name;
    }
}
