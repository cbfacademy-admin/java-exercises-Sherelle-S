package com.cbfacademy.shapes;
import java.lang.Math;
import java.text.DecimalFormat;

public class Paint{
    
    private double coverage;

    public Paint(double coverage){
        this.coverage = coverage;
    }

    public double amount(Shape shape){
        return shape.area()/coverage;
    }

    // public void amount(String shape, double height, double width, double radius){

    //     
    //     double areaToCover;
    //     double gallonsNeeded;
    //     DecimalFormat decimalFormat = new DecimalFormat("#.##");
    //     String gallonsRounded = decimalFormat.format(gallonsNeeded);
    //     String roundedAreaToCover = decimalFormat.format(areaToCover);

    //     if(shape.toLowerCase().equals("rectangle")){
    //         areaToCover = (2 *  (height * width));
           
    //         System.out.println("You will need " +gallonsRounded+ " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
    //     }else if(shape.toLowerCase().equals("sphere")){
    //         areaToCover = 4 * Math.PI * (radius * radius);
    //         System.out.println(radius);
    //         System.out.println("You will need " +(areaToCover / coverage )+ " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
    //     }else if(shape.toLowerCase().equals("tank")){
    //         areaToCover = (2 * Math.PI * radius * height);
    //         System.out.println(radius);
    //         System.out.println(height);
    //         System.out.println("You will need "+(areaToCover / this.coverage) + " gallons of paint to cover a "+shape+" with a surface area of " +areaToCover+".");
    //     }
    }

}
