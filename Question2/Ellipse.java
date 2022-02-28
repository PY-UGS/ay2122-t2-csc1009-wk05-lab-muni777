package com.Munigal.lab7;
import com.Munigal.lab7.Shape;

import java.lang.Math;

public class Ellipse extends Shape {
    public Ellipse (double majoraxis, double minoraxis) {
        super(majoraxis,minoraxis);
    }

    @Override
    public double area() {
        double area =  this.getDim1() * this.getDim2() * Math.PI;
        System.out.println("Inside Area for Ellipse");
        return area;
    }
}
