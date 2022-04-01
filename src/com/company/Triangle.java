package com.company;

/**
 * @Author Fil
 * @create 2022-04-01 13:01
 **/

public class Triangle extends Figure{
    private static final String name = "Triangle";
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1,double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double getArea() {
        double p = (getPerimeter()/2);
        double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return area;
    }

    @Override
    double getPerimeter() {
        return side1+side2+side3;
    }

    public static String getName() {
        return name;
    }

}
