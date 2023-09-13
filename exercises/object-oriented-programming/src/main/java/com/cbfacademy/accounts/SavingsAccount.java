package com.cbfacademy.accounts;

public class SavingsAccount extends Account{

<<<<<<< HEAD
    private double interestRate;

    public SavingsAccount(double balance, int accountNumber){
        super(balance, accountNumber);
        this.interestRate = interestRate;
=======
    private double interest;

    public SavingsAccount(double balance, int accountNumber, double interest){
        super(balance, accountNumber);
        this.interest = interest;
    }
>>>>>>> 216060d (account updated and complete)

    public void addInterest(){
        double interestAdded = ((this.balance * this.interest) / 100);
        double balancePlusInterest = this.balance + interestAdded;
        
        System.out.println("Your opening balance is £" +this.balance +".");
        System.out.println("After %"+ this.interest +" interest has been added, your closing balance is £" +balancePlusInterest);
    }

<<<<<<< HEAD
    // @Override
    public void depositFunds(){
        System.out.println("Your opening balance is £" +balance+".");
        double interest = ((balance * interestRate) / 100);
        balance += interest;
        System.out.println("After %"+ interestRate +" interest has been added, your closing balance is £" +balance);
    }   
=======
>>>>>>> 216060d (account updated and complete)
    
}
