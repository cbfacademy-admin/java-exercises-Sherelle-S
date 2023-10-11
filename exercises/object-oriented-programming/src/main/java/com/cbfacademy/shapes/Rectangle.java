package com.cbfacademy.shapes;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(String ShapeName, double length, double width) {
        super(ShapeName);
        this.length = length; 
        this.width = width;
    }
    // getters and setters were used for part one of the exercise when the radius was able to be changed on the public interface on my main App.js. which then got removed.

    // public double getLength(){
    //     return length;
    // }

    // public double getWidth(){
    //     return width;
    // }

    @Override
    public double area(){
        double rectangleArea = this.length * this.width;
        // System.out.println("The area of the "+shapeName+" is " + rectangleArea+".");
        return rectangleArea;
    }
    
}
