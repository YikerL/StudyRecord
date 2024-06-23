package com.homework.homework06;

public class SavingAccount extends BankAccount {
    private int count = 3;
    private double interest;

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void deposit(double amount) {
        if(count > 0) {
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount - 1);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(count > 0) {
            super.withdraw(amount);
            count --;
        } else {
            super.withdraw(amount + 1);
        }
    }

    public void earnMonthlyInterest() {
        interest = getBalance()*0.1;
        setBalance(getBalance() + interest);//月底计算本金加利息
        //super.deposit(interest);//将利息免次数消耗存入账户
        count = 3;
    }
}
