package com.Munigal.lab7;

import java.lang.Math;
public class Circle extends Shape {
    double radius1, radius2;

    public Circle(double radius1,
                  double radius2)
                   {
                       super(radius1,radius2);
                       this.radius1 = radius1;
                       this.radius2 = radius2;
                   }

    public void setRadius1(double radius) {
        this.radius1 = radius1;
    }

    public double getRadius1() {
        return radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public double area() {
        double area = Math.PI*radius1*radius2;
        System.out.println("Inside area for Circle");
        return area;
    }
}
