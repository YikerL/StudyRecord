package com.modifier;

public class ModifierA {

    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        //在同一类下/本类
        //该方法可以访问四个属性
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);

    }

    protected void m2() {}

    void m3() {}

    private void m4() {}
}

