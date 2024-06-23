package com.homework.homework08;

public class Homework08 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Jack", 30, '男', 8000);
        Doctor doctor2 = new Doctor("Jack", 30, '男', 8000);
        System.out.println(doctor1.equals(doctor2));
    }
}
