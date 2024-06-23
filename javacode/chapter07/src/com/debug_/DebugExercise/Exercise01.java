package com.debug_.DebugExercise;

public class Exercise01 {
    public static void main(String[] args) {

        Person jack = new Person("Jack", 18);
        //System.out.println(jack.toString());
        System.out.println(jack);
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}