package com.cbfacademy.shapes;

public abstract class Shape {
    private String shapeName;
    
    public Shape(String shapeName){
        this.setShapeName(shapeName); 
    };

        public String getShapeName(){
            return shapeName;
        }

        public void setShapeName(String newShape){
            this.shapeName = newShape;
        }

    public abstract double area();

    public String toString(){
        return getShapeName();
    }
    
}
