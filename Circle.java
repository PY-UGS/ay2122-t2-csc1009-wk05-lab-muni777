package com.Munigal.lab5;
import java.lang.Math;

class Circle extends GeometricObject{
    private double radius;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(String color,
                  boolean filled,
                  double radius) {
        super(color,filled);
        this.radius = radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = Math.PI*radius*getDiameter();
        return perimeter;
    }
    public double getDiameter(){
        double diameter = radius * 2;
        return diameter;
    }
    public void printCircle(){
        System.out.println("A circle " + toString());
    }
}
