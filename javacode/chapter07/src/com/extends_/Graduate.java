package com.extends_;

//大学生类
public class Graduate {
    public String name;
    public int age;
    private double
            scores;

    public void setScores(double scores) {
        this.scores = scores;
    }
    public void testing() {
        System.out.println("大学生" + name + "正在考高数");
    }
    public void showInfo() {
        System.out.println(name + " 的成绩是 " + scores + " 分");
    }
}
