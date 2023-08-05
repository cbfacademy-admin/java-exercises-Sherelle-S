package com.cbfacademy.shapes;

public class Paint {
    
    private double coverage;

    public void paint(double coverage){
        this.setCoverage(coverage);
    }

    protected double getCoverage(){
        return coverage;
    }

    public void setCoverage(double coverage){
        this.coverage = coverage;
    }

    public double amount(Shape, shape){
        System.out.println(getShapeName() +"Will use "+Shape+" gallons of paint to cover it.");
    }

    public void painShapes(double height, double width, double radius, double surface){
        if(this.shapeName == "rectangle"){
            surface = (2*  (height * width) * 2 * (height * width) * 2 * (height * width));
            System.out.println("The surface area of the "+ this.shapeName +" is" + surface +"you will need" /*gallons of paint */);
        }else if(this.shapeName ="Sphere"){
            surface = 4 * Math.PI * 2;
            System.out.println("The surface are of the "+this.shapeName +"is " + surface + " you will need " /*gallons of paint */);
        }else{
            surface = (2 * Math.PI * radius * height) * (2 * Math.PI * radius * height);
        }
        // Cylinder surface area A=2πrh+2πr2
        // Sphere surface area A=4πr2
        //  Rectangular prismsurface area A=2(wl+hl+hw)
    }
}
