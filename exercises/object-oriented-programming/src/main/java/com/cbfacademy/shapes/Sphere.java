package com.cbfacademy.shapes;
import java.lang.Math;

public class Sphere extends Shape {

    private double radius; 

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    // getters and setters were used for part one of the exercise when the radius was able to be changed on the public interface on my main App.js. which then
        protected double getRadius(){
            return radius;
        }

        // public double setRadius(double radius){
        //     return this.radius = radius;
        // }
       
    @Override
    public double area(){
        double calculateArea = 4 * Math.PI * (getRadius() * getRadius());
        // System.out.println("The area of your "+shapeName+" is " + calculateArea+".");

        Double sphereArea = (double) (Math.round(calculateArea*10.0)/10.0); 
        
        return sphereArea;
    }        
}
