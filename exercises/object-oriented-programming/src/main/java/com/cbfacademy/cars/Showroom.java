package com.cbfacademy.cars;


    public class Showroom {
        public static void main(String[] args) {
            System.out.println("Hello World!");
            Car car1 = new Car("Volvo","V40",2012);
            Car car2 = new Car("Porsche","Panamera",2009);
            Car car3 = new Car("Audi","A3",2018);
            car1.getDetals();
            car2.getDetals();
            car3.getDetals();
        
            System.out.println(car1.toString());
        }
    
}
