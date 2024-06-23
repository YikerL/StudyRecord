package com.homework.homework04;

public class Manager extends Employee {
    private double base = 1000;

    public Manager(String name, double daySal, double grade, int workdays) {
        super(name, daySal, grade, workdays);
    }

    @Override
    public void printSal() {
        System.out.println(getName() + "的工资是" + (base + total()));
    }
}
