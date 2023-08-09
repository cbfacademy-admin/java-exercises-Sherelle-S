package com.cbfacademy.cars;


    public class Showroom {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            Car car1 = new Car("Volvo","V40",2012);
        Car car2 = new Car("Porsche","Panamera",2009);
        Car car3 = new Car("Audi","A3",2018);
        System.out.println(car1.model + " "+ car1.make +" " + car1.year);
        System.out.println(car2.model + " "+ car2.make +" " + car2.year);
        System.out.println(car3.model + " "+ car3.make +" " + car3.year);

     String make; 
     String model; 
     int year;

    public Showroom(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
