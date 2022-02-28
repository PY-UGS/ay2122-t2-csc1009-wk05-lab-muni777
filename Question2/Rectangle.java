package com.Munigal.lab7;

import com.Munigal.lab7.Shape;

public class Rectangle extends Shape {
    double height;
    double length;
    public Rectangle(double height,
                     double length)
    {
                          super(height,length);
                          this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        double area = getHeight()*getLength();
        System.out.println("Inside Area for Rectangle");
        return area;
    }
}
