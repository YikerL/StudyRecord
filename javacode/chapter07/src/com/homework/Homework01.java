package com.homework;

public class Homework01 {
    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Person("Jack", 19, "student");
        persons[1] = new Person("Bob", 88, "doctor");
        persons[2] = new Person("Emily", 38, "teacher");

        Person temp = null;//临时变量
        //按年龄大小排
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() >= persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }

        for (int k = 0; k < persons.length; k++) {
            System.out.println(persons[k]);
        }

        //按名字长度排列
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getName().length() < persons[j + 1].getName().length()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }


        for (int k = 0; k < persons.length; k++) {
            System.out.println(persons[k]);
        }
    }
}


class Person {

    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}