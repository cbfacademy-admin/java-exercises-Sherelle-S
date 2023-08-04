package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber);
        this.interestRate = interestRate;

    }

    // @Override
    public void depositFunds(){
        System.out.println("Your opening balance is £" +balance+".");
        double interest = ((balance * interestRate) / 100);
        balance += interest;
        System.out.println("After %"+ interestRate +" interest has been added, your closing balance is £" +balance);
    }   
    
}
