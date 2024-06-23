package com.homework.homework06;

public class BankAccount {
    private double balance;//余额

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存钱
    public void deposit(double amount) {
        balance += amount;
    }

    //取钱
    public void withdraw(double amount) {
        balance -= amount;
    }
}
