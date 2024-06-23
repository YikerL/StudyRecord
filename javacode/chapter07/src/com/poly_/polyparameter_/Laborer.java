package com.poly_.polyparameter_;

public class Laborer extends Employee {
    public Laborer(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println(getName() + "在工作...");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
