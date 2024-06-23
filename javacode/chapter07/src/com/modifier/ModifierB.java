package com.modifier;

public class ModifierB {
    public void say() {
        ModifierA a = new ModifierA();
        //在同一个包下
        //可以访问public, protected, 默认
        //不能访问private
        System.out.println("n1=" + a.n1);
        System.out.println("n2=" + a.n2);
        System.out.println("n3=" + a.n3);
        //System.out.println("n4=" + a.n4);
        //'n4' has private access in 'com.modifier.ModifierA'
        a.m1();
        a.m2();
        a.m3();
        //a.m4();
        //'m4()' has private access in 'com.modifier.ModifierA'

    }
}
