package com.cbfacademy.accounts;

public class Account {
    protected double balance;
    private int accountNumber;

    public Account(double balance, int accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    // public void balance(double newBalance){
    //     this.balance = newBalance;
    // }

    public void depositFunds( double deposit){
        if(deposit < 0){
            this.balance += 0;
                }else{
            this.balance += deposit;
            } 
        System.out.println("Funds have been deposited to account number :" + this.accountNumber + ". The balance is now " + this.balance +".");
    }

    public void withdrawFunds(double withdraw){

        if(withdraw > balance){
            System.out.println("Insuffiecient funds available to withdraw £" +withdraw+". you can currently withdraw £" + this.balance +"." );
            System.out.println("£ "+ this.balance +" have been withdrawn from this account.");
            balance -= balance; 
            System.out.println("Your new balance is now £" + this.balance +".");
                    

        // do the math so you only take as much as a 0 balance
            }else{
                balance -= withdraw;
                System.out.println("£ "+withdraw +" have been withdrawn from this account. The new balance is now " + this.balance +".");

            }
    }
    

    }