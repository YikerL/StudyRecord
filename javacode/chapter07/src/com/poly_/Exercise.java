package com.poly_;

public class Exercise {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);//20
        s.display();//20
        Base b = s;//向下转型，b指向s指向的地方，运行类型是sub
        System.out.println(b == s);//true
        System.out.println(b.count);//10
        b.display();//20
    }
}

class Base {
    int count = 10;
    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base {
    int count = 20;
    public void display() {
        System.out.println(this.count);
    }
}