package com.Munigal.lab5;

public class Triangle extends Shape{
    double height;
    double base;

    public Triangle(double height,
                    double base)
    {
        super(height,base);
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double area() {
        double area = (getHeight()*getBase())/2;
        System.out.println("Inside area for Triangle");
        return area;

    }
}

