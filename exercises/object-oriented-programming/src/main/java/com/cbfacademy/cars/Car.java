package com.cbfacademy.cars;

public class Car {
    public String make;
    public String model;
    public int year;
   

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    

    public String getMake(){
        return this.make;
    }

    public String getModel(){
    return this.model;
    }

    public int getYear(){
    return this.year;
    }

    public String getDetals(){
        return "Have you seen my nice new " +this.make+"? It's a " +this.model+ " You know. It was released in " + this.year + ". \n";
    }

    @Override
    public String toString(){
        String newCar = make + "\n"+model + "\n" + year;
        return newCar;
    }
}