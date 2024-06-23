package com.homework.homework09;

public class Homework09 {
    public static void main(String[] args) {

        //向上转型  父类引用指向子类对象
        //可以调用的方法看编译类型
        Person person = new Student();
        person.eat();//运行类型的eat，运行类型没有eat去父类找
        person.run();//运行类型的run
        //person.study();//错误
        //Cannot resolve method 'study' in 'Person'

        //向下转型
        Student stu0 = (Student)person;
        stu0.run();//student run 运行类型Student的run
        stu0.eat();//person eat  Student的中没有eat，去父类找
        stu0.study();//student study

    }
}
