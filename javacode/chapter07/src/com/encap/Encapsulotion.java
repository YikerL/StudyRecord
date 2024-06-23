package com.encap;

public class Encapsulotion {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Jack");
        person.setAge(30);
        //person.setSalary(5555.5);
        System.out.println(person.info());
        //System.out.println(person.salary);//不给访问
        System.out.println(person.getSalary());

        //
        Person bob = new Person("Bob", 99, 8000);
        System.out.println("输出Bob的信息:");
        System.out.println(bob.info());//防护机制失效了
        //将构造器和setXxx结合即可避免

    }
}

class Person {
    public String name;//名字公有化
    private int age;//年龄私有化
    private double salary;//工资私有化

    //构造器 阿勒泰+ insert

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    //快捷键alt + insert
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //名字不能多于六个字符
        //增加业务逻辑
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("请输入正确的名字");
            this.name = null;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <=120) {
            this.age = age;
        } else {
            System.out.println("请输入正确的年龄");
            this.age = 0;//给一个默认年龄
        }
    }

    public double getSalary() {
        //增加对当前对象的权限判断
        //权限不够不给看
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


//    public void print() {
//        System.out.println("name=" + name);
//        System.out.println("age=" + age);
//        System.out.println("salary=" + salary);
//    }
    //返回属性信息
    public String info() {
        return "名字=" + name + " 年龄=" + age + " 薪水=" + salary;
    }
}