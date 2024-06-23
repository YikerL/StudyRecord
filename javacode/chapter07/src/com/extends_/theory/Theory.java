package com.extends_.theory;

//继承的本质

public class Theory {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);//大头儿子
        //System.out.println(son.age);//大头儿子
        //被堵住了到不了grandpa类里面
        System.out.println(son.getAge());//40
        System.out.println(son.hobby);//40
    }

}

class Grandpa {
    String name = "大头爷爷";
    String hobby = "旅游";
    int age = 66;
}

class Father extends Grandpa {
    String name = "大头爸爸";
    private int age = 40;

    public int getAge() {
        return age;
    }
}

class Son extends Father {
    String name = "大头儿子";
}
