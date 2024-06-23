package com.homework.homework10;

public class Student extends Person{
    private String stu_ID;

    public Student(String name, char gender, int age, String stu_ID) {
        super(name, gender, age);
        this.stu_ID = stu_ID;
    }

    public String getStu_ID() {
        return stu_ID;
    }

    public void setStu_ID(String stu_ID) {
        this.stu_ID = stu_ID;
    }

    public void study() {
        System.out.println("我会好好学习");
    }

    @Override
    public String play() {
        return getName() + "爱踢足球";
    }

    @Override
    public void perPrint() {
        System.out.println("学生的信息：");
        super.perPrint();
        System.out.println("学号：" + stu_ID);
        //System.out.println("学号：" + getStu_ID());
        this.study();
        System.out.println(this.play());
        System.out.println("____________________");
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "stu_ID='" + stu_ID + '\'' +
                '}';
    }
}
