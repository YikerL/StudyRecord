package com.homework.homework04;

public class Homework04 {
    public static void main(String[] args) {
        Employee jack = new Manager("Jack", 500, 1.2, 24);
        jack.printSal();
        Employee smith = new Worker("Smith", 250, 1.0, 24);
        smith.printSal();
    }
}
