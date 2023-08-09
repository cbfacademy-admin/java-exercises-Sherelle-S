package com.cbfacademy;

// import com.cbfacademy.cars.Cars;
import com.cbfacademy.accounts.Account;
import com.cbfacademy.accounts.CurrentAccount;
import com.cbfacademy.accounts.SavingsAccount;
import com.cbfacademy.cars.Car;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Car car1 = new Car("Volvo","V40",2012);
        Car car2 = new Car("Porsche","Panamera",2009);
        Car car3 = new Car("Audi","A3",2018);
        System.out.println(car1.model + " "+ car1.make +" " + car1.year);
        System.out.println(car2.model + " "+ car2.make +" " + car2.year);
        System.out.println(car3.model + " "+ car3.make +" " + car3.year);

        System.out.println(car1.toString());
        car2.getDetals();

        // Account account = new Account(1500, 875093);

        // System.out.println("Your  account balance is £" + account.getBalance());  
        // account.depositFunds(120);
        // account.withdrawFunds(2000);

        // CurrentAccount currentAccount = new CurrentAccount(200, 875093, 1000);
        // System.out.println("Your current account balance is £" +currentAccount.getBalance());
        // currentAccount.setOverdraftLimit(2000.00);
        // currentAccount.withdrawFunds(-10);
        
        
        // SavingsAccount savingsAccount = new SavingsAccount(1500, 875093,1.25);
        // System.out.println(account.getBalance());  
        // System.out.println("Your savings account balance is £"+ savingsAccount.getBalance()+".");    
        // savingsAccount.depositFunds(1250);
        // savingsAccount.addInterest();
        
        
    }
}