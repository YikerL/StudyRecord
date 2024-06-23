package com.extends_.improve;
//父类
public class Student {

    //共有属性
    public String name;
    public int age;
    private double scores;

    //共有方法
    public void setScores(double scores) {
        this.scores = scores;
    }
    public void showInfo() {
        System.out.println(name + " 的成绩是 " + scores + " 分");
    }

}
