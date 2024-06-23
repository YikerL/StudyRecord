package com.extends_;

//小学生类
public class Pupil {
    public String name;
    public int age;
    private double scores;

    public void setScores(double scores) {
        this.scores = scores;
    }

    public void testing() {
        System.out.println("小学生" + name + "正在考试");
    }

    public void showInfo() {
        System.out.println(name + " 的成绩是 " + scores + " 分");
    }


}
