package com.homework.homework08;

public class Doctor {
    private String name;
    private int age;
    private char gender;
    private  double salary;

    public Doctor(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object obj) {
            //判断是否是它本身
            if(this == obj) {
                return true;
            }
            //判断obj是否是doctor类型或其子类
            if(!(obj instanceof Doctor)) {
                return false;
            }

            //向下转型,因为obj的运行类型是Doctor或其子类
            Doctor doctor = (Doctor)obj;
            return this.name.equals(doctor.getName())
                    && this.age == doctor.getAge()
                    && this.gender == doctor.getGender()
                    && this.salary == doctor.getSalary();
    }
}
