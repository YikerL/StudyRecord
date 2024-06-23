package com.poly_.polyarr_;

public class Student extends Person {
    private double scores;

    public Student(String name, int age, double scores) {
        super(name, age);
        this.scores = scores;
    }

    public double getScores() {
        return scores;
    }

    public void setScores(double scores) {
        this.scores = scores;
    }

    @Override
    public String say() {
        return super.say() + "\t" + scores;
    }

    public void study() {
        System.out.println(getName() + "在！学习");
    }
}
