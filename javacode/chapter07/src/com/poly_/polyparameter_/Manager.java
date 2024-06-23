package com.poly_.polyparameter_;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println(getName() + "在摸鱼...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }

}
