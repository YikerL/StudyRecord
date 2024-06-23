package com.homework.homework03;

public class AssociateProfessor extends Teacher {
    public AssociateProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    @Override
    public void introduce() {
        //super.introduce();
        System.out.println(getName() + " " + getAge() + "岁,职位是" + getPost()
                + ",工资是" + getSalary() + ",工资级别是" + getGrade());
    }
}
