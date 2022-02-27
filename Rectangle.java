package com.Munigal.lab5;

public class Rectangle3 extends GeometricObject{
    double width;
    double height;

    public Rectangle3(){

    }
    public Rectangle3(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public Rectangle3(String color,
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

