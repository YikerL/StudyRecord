package com.homework.homework10;

public class Teacher extends Person{
    private double work_age;

    public Teacher(String name, char gender, int age, double work_age) {
        super(name, gender, age);
        this.work_age = work_age;
    }

    public double getWork_age() {
        return work_age;
    }

    public void setWork_age(double work_age) {
        this.work_age = work_age;
    }

    public void teach() {
        System.out.println("我会认真教学");
    }

    @Override
    public String play() {
        return getName() + "爱下象棋";
    }

    @Override
    public void perPrint() {
        System.out.println("老师的信息：");
        super.perPrint();
        System.out.println("工龄：" + getWork_age());
        this.teach();
        System.out.println(this.play());
        System.out.println("____________________");
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "work_age=" + work_age +
                '}';
    }
}
