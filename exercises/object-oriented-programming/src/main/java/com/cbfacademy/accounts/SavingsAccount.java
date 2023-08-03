package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber);

    }

    @Override
    public void depositFunds(double interestRate){
        System.out.println("Your opening balance is £" +getBalance()+".");
        double interest = ((getBalance() * interestRate) / 100);
        setBalance(getBalance() + interest);
        System.out.println("After %"+ interestRate +" interest has been added, your closing balance is £" +getBalance());
    }   
    
}
