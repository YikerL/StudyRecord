package com.homework.homework05;

import com.sun.prism.shader.Solid_RadialGradient_REFLECT_AlphaTest_Loader;

public class Homework05 {
    public static void main(String[] args) {
        new Demo().test();//匿名对象
        //rose jack
        System.out.println("============");
        new Demo("john").test();//john jack
        System.out.println("===========");
        Test test = new Test();
        System.out.println(test.name);

    }
}

class Test {
    String name = "rose";
    public Test() {
        System.out.println("00000000");
    }
    public Test(String name) {
        this.name = name;
    }
}

class Demo extends Test {
    String name = "jack";
    public Demo() {
        //super();//不写也会调用
        System.out.println("11111111");
    }
    public Demo(String name) {
        super(name);
    }
    public void test() {
        System.out.println(super.name);
        System.out.println(this.name);
    }

}