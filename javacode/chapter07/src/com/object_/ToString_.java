package com.object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("小妖怪", "小队长", 8000);
        System.out.println(monster.toString());
        System.out.println(monster.hashCode());

        System.out.println("=========");
        //当直接输出一个对象时，默认会调用toString
        System.out.println(monster);
        //<=>System.out.println(monster.toString());

    }
}

class Monster {
    private String name;
    private String job;
    private double salary;

    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    //重写toString，输出对象属性
    //快捷键alt + insert

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", salary=" + salary +
                '}';
    }
}