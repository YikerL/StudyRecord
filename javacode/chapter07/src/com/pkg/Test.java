package com.pkg;

import com.modifier.ModifierA;

public class Test {
    public static void main(String[] args) {

        //不同包里只能只能访问public 类
        ModifierA a = new ModifierA();
        System.out.println("n1=" + a.n1);
        //System.out.println("n2=" + a.n2);
        //'n2' has protected access in 'com.modifier.ModifierA'
        //System.out.println("n3=" + a.n3);
        //'n3' is not public in 'com.modifier.ModifierA'. Cannot be accessed from outside package
        a.m1();
        //a.m2();
        //'m2()' has protected access in 'com.modifier.ModifierA'

        //a.m3();
        //'m3()' is not public in 'com.modifier.ModifierA'. Cannot be accessed from outside package
    }
}
