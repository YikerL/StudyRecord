package com.homework.homework06;

public class Homework06 {
    public static void main(String[] args) {
//        BankAccount jack = new BankAccount(2000);
//        jack.deposit(20);
//
//        System.out.println(jack.getBalance());
//
//        CheckingAccount john = new CheckingAccount(2000);
//        john.deposit(20);
//        System.out.println(john.getBalance());
//        john.withdraw(19);
//        System.out.println(john.getBalance());

        SavingAccount bob = new SavingAccount(3000);
        bob.deposit(50);
        System.out.println(bob.getBalance());
        bob.deposit(100);
        System.out.println(bob.getBalance());
        bob.withdraw(300);
        System.out.println(bob.getBalance());
        bob.withdraw(50);
        System.out.println(bob.getBalance());
        bob.earnMonthlyInterest();
        System.out.println(bob.getBalance());//count重置

        bob.withdraw(78.9);
        System.out.println(bob.getBalance());


    }
}
