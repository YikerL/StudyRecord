package codeblock_;

public class Detail01 {
    public static void main(String[] args) {

        //类被加载的情况
        //1.创建对象实例时
        //AA aa = new AA();
        //2.创建子类对象时，父类先被加载，子类后被加载
        //AA aa1 = new AA();
        //3.使用类的静态成员时
        //System.out.println(Cat.age);


        Dog dog = new Dog();
        Dog dog1 = new Dog();
        System.out.println(Dog.age);

    }
}


class Dog{
    public static int age = 8;

    {
        System.out.println("DOG 代码块1被执行");
    }
}

class Cat{
    public static int age = 18;

    static{
        System.out.println("cat cat cat");
    }
}

class BB {
    static{
        System.out.println("BB  静态代码块1被执行...");
    }
}

class AA extends BB{
    static{
        System.out.println("AA  静态代码块1被执行...");
    }
}

