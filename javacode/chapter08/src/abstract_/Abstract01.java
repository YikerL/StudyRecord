package abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}

abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public Animal() {
    }
    //    {
//        System.out.println("111");
//    }

    //抽象方法 没有方法体
    // （必须放在抽象类里（在子类中实现
    public abstract void eat();
}

class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(getName() + "吃鱼");
    }
}
