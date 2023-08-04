package com.cbfacademy.shapes;
import java.lang.Math;

public class Sphere extends Shape {

    private double radius; 

    public Sphere(String shapeName, double radius) {
        super(shapeName);
        this.setRadius(radius);
    }

        protected double getRadius(){
            return radius;
        }

        public double setRadius(double radius){
            return this.radius = radius;
        }

    // @Override    
    // public String shapeName(){
    //     this.shapeName = "Sphere";
    // }
        
    @Override
    public double area(){
        double calculateArea = 4 * Math.PI * (getRadius() * getRadius());
        System.out.println("The area of your sphere is " + calculateArea+".");

        Double sphereArea = (double) (Math.round(calculateArea*10.0)/10.0);
        
        return sphereArea;
    }        
}
