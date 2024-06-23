package com.object_;

public class Finalize_ {
    public static void main(String[] args) {
        //Object;
        Cat tom = new Cat("Tom");
        tom = null;

        System.gc();

        System.out.println("程序结束");
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(".......");
    }
}
