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

        if(withdraw > 0 && withdraw <= getBalance()){
            
                setBalance(getBalance() - withdraw);
                System.out.println("£"+withdraw + " have been withdrawn from this account. £" +getBalance()+ " is remaining.");
        
        }else if(getBalance() - withdraw < 0 && getBalance() - withdraw >= -overdraftLimit){

            setBalance(getBalance() - withdraw);
            System.out.println("Your new balance is £"+ getBalance());
                if(getBalance() < 0){

                    overdrawn += getBalance();
                    System.out.println("You are overdrawn by £" +overdrawn);

                }else{

                    overdrawn = 0;
                    System.out.println("You are not overdrawn");

                }         

        // }else if(getBalance() - withdraw >= -overdraftLimit ){   
            
        }else{
                limitReached();
              
        }
    }

    public void limitReached(){
            System.out.println("I'm sorry, you have reached your overdraft limit");
            System.out.println("Insufficient funds available for this transaction.");
    }   
}
