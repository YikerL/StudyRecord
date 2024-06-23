package com.homework.homework10;

public class Person {
    private String name;
    private char gender;
    private int age;

    public Person() {
    }

    public Person(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play() {
        return name + "玩耍";
    }

    public void work(Person per) {
        if(per instanceof Student) {
            ((Student) per).study();
        } else if (per instanceof Teacher) {
            ((Teacher) per).teach();
        }
    }

    public void perPrint() {
        System.out.println("姓名:" + getName());
        System.out.println("年龄:" + getAge());
        System.out.println("性别:" + getGender());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
