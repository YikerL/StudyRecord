package com.extends_.improve;

public class TestExtends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小学生";
        pupil.age = 7;
        pupil.testing();
        pupil.setScores(80);
        pupil.showInfo();

        System.out.println("============");
        Graduate graduate = new Graduate();
        graduate.name = "大学生";
        graduate.age = 19;
        graduate.testing();
        graduate.setScores(61);
        graduate.showInfo();


    }
}
