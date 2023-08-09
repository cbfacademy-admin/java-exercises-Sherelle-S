package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

    private double interest;

    public SavingsAccount(double balance, int accountNumber, double interest){
        super(balance, accountNumber);
        this.interest = interest;
    }

    public void addInterest(){
        double interestAdded = ((this.balance * this.interest) / 100);
        double balancePlusInterest = this.balance + interestAdded;
        
        System.out.println("Your opening balance is £" +this.balance +".");
        System.out.println("After %"+ this.interest +" interest has been added, your closing balance is £" +balancePlusInterest);
    }

    
}
