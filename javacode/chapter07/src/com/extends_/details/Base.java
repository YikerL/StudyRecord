package com.extends_.details;

public class Base {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 399;
    private int n4 = 400;
    public Base() {
        System.out.println("base...");
    }
    public Base(String name) {
        //System.out.println("name is ...");
        System.out.println("name is " + name);
    }
    public Base(int age) {
        System.out.println("age is " + age);
    }

    public int getN4() {
        return n4;
    }

    public void test100() {
        System.out.println("test100");
    }
    protected void test200() {
        System.out.println("test200");
    }
    void test300() {
        System.out.println("test300");
    }
    private void test400() {
        System.out.println("test400");
    }
    public void callTest400() {
        test400();
    }

}
