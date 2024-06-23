package com.extends_.exercise;

public class Exercise1 {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    public A() {
        System.out.println("我是A类");
    }
}

class B extends A {
    public B() {
        System.out.println("我是B类");
    }
    public B(String name) {
        //super();//默认有，要小心
        System.out.println("B类有参构造");
    }
}

class C extends B {
    public C() {
        this("hello");
        System.out.println("我是C类");

    }
    public C(String name) {
        super("hi");
        System.out.println("C类有参构造");
    }
}

