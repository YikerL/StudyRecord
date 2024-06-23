package com.object_.Exercise_;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj instanceof Person) {//类型判断
            Person a = (Person) obj;
            return a.name.equals(this.name) && a.age == this.age && a.gender == this.gender;
        }
        return false;
    }
}
