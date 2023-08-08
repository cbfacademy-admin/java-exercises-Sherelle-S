package com.cbfacademy.shapes;
import java.text.DecimalFormat;

public class Paint{
    
    private double coverage;

    public Paint(double coverage){
        this.coverage = coverage;
    }

    public double amount(Shape shape){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String roundGallons = decimalFormat.format(shape.area()/this.coverage);
        String roundArea = decimalFormat.format(shape.area());

        System.out.println("You will need " +roundGallons+ " gallons of paint to cover a "+shape+" with a rounded surface area of " +roundArea+".");
        return shape.area()/this.coverage;
    }

}
