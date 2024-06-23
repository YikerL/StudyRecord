package com.extends_;

import com.extends_.improve.Graduate;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小米";
        pupil.age = 8;
        pupil.testing();
        pupil.setScores(99);
        pupil.showInfo();

        System.out.println("============");
        com.extends_.improve.Graduate graduate = new Graduate();
        graduate.name = "大壮";
        graduate.age = 19;
        graduate.testing();
        graduate.setScores(61);
        graduate.showInfo();
    }
}

