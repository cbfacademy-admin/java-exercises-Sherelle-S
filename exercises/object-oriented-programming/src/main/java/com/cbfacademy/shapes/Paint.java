package com.cbfacademy.shapes;
import java.lang.Math;
import java.text.DecimalFormat;

public class Paint{
    
    private double coverage;

    public Paint(double coverage){
        this.coverage = coverage;
    }

    public double amount(Shape shape){
        System.out.println("You will need " +shape.area()/coverage+ " gallons of paint to cover a "+shape+" with a surface area of " +shape.area()+".");
        return shape.area()/coverage;
    }

}
