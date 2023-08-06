package com.cbfacademy.shapes;
import java.lang.Math;

public class Paint extends Shape{
    
    private double coverage;

    public Paint(String shapeName, double coverage){
        super(shapeName);
        // this.setCoverage(coverage);
        this.coverage = coverage;
    }

    protected double getCoverage(){
        return coverage;
    }

    // public void setCoverage(double coverage){
    //     this.coverage = coverage;
    // }

    public void amount(String shape, double height, double width, double radius){
        double areaToCover;
        System.out.println(shape);
        System.out.println(height);
        System.out.println(radius);
        System.out.println(width);
        // double amountOfGallons = 0;
        // double gallonsOfPaint = areaToCover / coverage;
        if(shapeName.toLowerCase().equals("rectangle")){
            areaToCover = (2 *  (height * width));
            // System.out.println(height);
            // System.out.println(width);
            System.out.println("You will need " +(areaToCover / coverage )+ " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
        }else if(shapeName.toLowerCase().equals("sphere")){
            areaToCover = 4 * Math.PI * (radius * radius);
            System.out.println(radius);
            System.out.println("You will need " +(areaToCover / coverage )+ " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
        }else if(shapeName.toLowerCase().equals("tank")){
            areaToCover = (2 * Math.PI * radius * height);
            System.out.println(radius);
            System.out.println(height);
            System.out.println("You will need "+(areaToCover / this.coverage) + " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
        }
    }

    @Override
    public double area() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'area'");
    }
}
