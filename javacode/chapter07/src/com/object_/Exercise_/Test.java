package com.object_.Exercise_;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Bob");
        person1.setAge(18);
        person1.setGender('男');
        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(18);
        person2.setGender('男');

        //System.out.println(person1.equals(person2));//false
        //未重写equals时,是两个不同的对象
        //System.out.println(person1 == person2);//false


        System.out.println(person1.equals(person2));//true
        //重写了equals后对比两个对象每个属性，都相同表面他们是同一个人

    }
}
