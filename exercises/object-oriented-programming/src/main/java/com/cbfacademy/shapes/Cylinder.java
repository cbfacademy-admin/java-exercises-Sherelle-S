package com.cbfacademy.shapes;
import java.text.DecimalFormat;


public class Cylinder extends Shape {
    
    private double height;
    private double radius;

    public Cylinder(String shapeName, double height, double radius){
        super(shapeName);
        this.height = height;
        this.radius = radius;
    }

        // getters and setters were used for part one of the exercise when the radius was able to be changed on the public interface on my main App.js. which then got removed.
        // protected double getHeight(){
        //     return height;
        // }

        // protected double getRadius(){
        //     return radius;
        // }

        @Override
        public double area(){
            double cylinderArea = 2 * Math.PI * this.radius * this.height;
            // System.out.println("The area of the "+ shapeName+ " is "+ cylinderArea +".");
            return cylinderArea;
            
        }
}
