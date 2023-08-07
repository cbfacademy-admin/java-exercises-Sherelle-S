package com.cbfacademy.shapes;

public abstract class Shape {
    protected String shapeName;
    
    protected Shape(String shapeName){
        this.shapeName = shapeName;                  ; 
    };

       
    public abstract double area();

    public String toString(){
        return this.shapeName;
    }
    
}
