package com.modifier;

public class Test {
    public static void main(String[] args) {
        ModifierA a = new ModifierA();
        a.m1();
        System.out.println("=========================");
        ModifierB b = new ModifierB();
        b.say();
    }
}

//只有默认和public可以修饰类
class Dog {

}

//protected class Cat {}
//Modifier 'protected' not allowed here

//private class Bird {}
//Modifier 'private' not allowed here