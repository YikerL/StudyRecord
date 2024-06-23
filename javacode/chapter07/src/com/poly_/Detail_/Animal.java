package com.poly_.Detail_;

public class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void run() {
        System.out.println(name + "到处跑");
    }

    public void eat() {
        System.out.println(name + "吃东西");
    }
}
