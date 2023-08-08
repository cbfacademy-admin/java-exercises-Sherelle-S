package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String ShapeName, double length, double width) {
        super(ShapeName);
        this.length = length; 
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    @Override
    public double area(){
        double rectangleArea = this.length * this.width;
        // System.out.println("The area of the "+shapeName+" is " + rectangleArea+".");
        return rectangleArea;
    }
    
}
