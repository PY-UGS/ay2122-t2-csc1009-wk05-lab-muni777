package com.Munigal.lab5;

public class Rectangle2 extends GeometricObject{
    double width;
    double height;

    public Rectangle2(){

    }
    public Rectangle2(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle2(String color,
                      boolean filled,
                      double width,
                      double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(){
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(){
        this.height = height;
    }
    public double getArea(){
        return getHeight() * getWidth();
    }
    public double getPerimeter()
    {
        return(2 * width + 2 * height);
    }
}

