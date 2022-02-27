package com.Munigal.lab5;
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date DateCreated;

    public GeometricObject()
    {
        this.color = "White";
        this.filled = false;
        this.DateCreated = new Date();

    }

   public GeometricObject(String color, boolean filled){
       this.color = color;
       this.filled = false;
       this.DateCreated = new Date();
   }

   public void setColor(String color){
       this.color=color;
   }
   public String getColor(){
       return color;
   }
   public void setFilled(boolean filled){
       this.filled = filled;
   }
    public boolean isFilled() {
        return filled;
    }
    public Date getDateCreated() {
        return DateCreated;
    }
    public String toString(){
       String print = "created on " +getDateCreated() + "\ncolor: " + color + " and filled: " + filled;
       return print;

    }
}



