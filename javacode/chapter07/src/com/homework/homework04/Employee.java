package com.homework.homework04;

public class Employee {
    private String name;
    private double daySal;

    private double grade;
    private int workdays;

    public Employee(String name, double salary, double grade, int workdays) {
        this.name = name;
        this.daySal = salary;
        this.grade = grade;
        this.workdays = workdays;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return daySal;
    }

    public void setSalary(double salary) {
        this.daySal = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getWorkdays() {
        return workdays;
    }

    public void setWorkdays(int workdays) {
        this.workdays = workdays;
    }

    public double total() {
        return daySal * workdays * grade;
    }

    public void printSal() {

        System.out.println(name + "的总工资是" + total());
    }
}
