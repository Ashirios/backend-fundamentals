package org.example;

public class BankAccount {
    private double balance;
    private double minimumBalance;
    private boolean isActive = true;
    private String holderName;


    public BankAccount(double initialBalance, double minimumBalance) {
        this.balance = initialBalance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinimumBalance() {
        return minimumBalance;
    }
    
    public double withdraw(double amount){
        if(balance - amount > minimumBalance){
            balance -= amount;
        } else {
            throw new RuntimeException();
        }
        return balance;
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

}
