package com.poly_.Detail_;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    public void eat() {
        System.out.println(name + "吃...");
    }

    public void play() {
        System.out.println(name + "玩玩具");
    }
}
