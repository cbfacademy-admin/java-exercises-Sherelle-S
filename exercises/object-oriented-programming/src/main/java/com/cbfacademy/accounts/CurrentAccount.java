package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    
    private double overdraftLimit;

    public CurrentAccount(double balance, int accountNumber, double overdraftLimit){
        super(balance, accountNumber);
        this.setOverdraftLimit(overdraftLimit);
    }

    
    public double getOverdraftLimit(){
        return overdraftLimit;
    }
    
    public void setOverdraftLimit(double newLimit) {
        this.overdraftLimit = newLimit;
        System.out.println("Your new overdraft limit is £"+newLimit);
    }

    @Override
    public void withdrawFunds(double withdraw){

        double overdrawn = 0;

        if(withdraw > 0 && withdraw <= balance){
            
                balance -= withdraw;
                System.out.println("£"+withdraw + " have been withdrawn from this account. £" +balance+ " is remaining.");
        
        }else if(balance - withdraw < 0 && balance - withdraw >= -overdraftLimit){

            balance -= withdraw;
            System.out.println("Your new balance is £"+ balance);
                if(balance < 0){

                    overdrawn += balance;
                    System.out.println("You are overdrawn by £" +overdrawn);

                }else{

                    overdrawn = 0;
                    System.out.println("You are not overdrawn");

                }         

        // }else if(balance - withdraw >= -overdraftLimit ){   
            
        }else{
                limitReached();
              
        }
    }

    public void limitReached(){
            System.out.println("I'm sorry, you have reached your overdraft limit");
            System.out.println("Insufficient funds available for this transaction.");
    }   
}
