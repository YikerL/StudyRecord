package com.override_;

public class Exercise01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 88);
        System.out.println(person.say());
        //person.say();
        Student student = new Student("Bob",18,"1862310220", 88.8);
        System.out.println(student.say());
        //student.say();
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    public void say() {
//        System.out.println(name + " " + age);
//    }

    public String say() {
        return name + " " + age;
    }
}

class Student extends Person {
    private String id;
    private double scores;

    public Student(String name, int age, String id, double scores) {
        super(name, age);
        this.id = id;
        this.scores = scores;
    }

//    public void say() {
//        super.say();
//        System.out.println(id + " " + scores);
//    }

    public String say() {
        return super.say() + " " + id + " " + scores;
    }
}