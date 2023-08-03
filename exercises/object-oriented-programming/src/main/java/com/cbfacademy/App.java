package com.cbfacademy;

// import com.cbfacademy.cars.Cars;
import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;
import com.cbfacademy.shapes.Cylinder;
import com.cbfacademy.shapes.Rectangle;
import com.cbfacademy.shapes.Shape;
import com.cbfacademy.shapes.Sphere;

    // protect so the children can see it and manipulate
    // public for methods we know we will be calling from outside of the class
    // private for things only manipulated by - instance variables should be private unless you want hem to be acessed outside
    // fields are usually private of protected if a descendent class needs to access it.

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Account account = new Account(1500, 875093);

        // System.out.println("Your  account balance is £" + account.getBalance());  
        // account.depositFunds(120);
        // account.withdrawFunds(2000);

        // CurrentAccount currentAccount = new CurrentAccount(200, 875093, 1000);
        // System.out.println("Your current account balance is £" +currentAccount.getBalance());
        // currentAccount.setOverdraftLimit(2000.00);
        // currentAccount.withdrawFunds(3500);
        
        // SavingsAccount savingsAccount = new SavingsAccount(1500, 875093);
        // System.out.println("Your savings account balance is £"+ savingsAccount.getBalance()+".");
        // savingsAccount.depositFunds(1.25);

        Rectangle rectangle = new Rectangle("Rectangle", 4, 4);
        rectangle.area();
        // rectangle.toStrig();
        // System.out.println(rectangle.toString());
        System.out.println(rectangle.getShapeName());

        Sphere sphere = new Sphere("Sphere", 10);
        sphere.area();
        System.out.println("Yolo"+sphere.toString());

        Cylinder cylinder = new Cylinder("Cylinder", 10, 5);
        cylinder.area();        
        // // Cars myCar = new Cars();

        // Cars car = new Cars();
        // // System.out.println(myCar.model);
        // System.out.println(car.toString());
        // car.getDetals();
        // // myCar.getModel();
    }
}