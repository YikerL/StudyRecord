package com.poly_.Detail_;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Dog("大黄",18);
        animal.run();
        animal.eat();
        //animal.play();
        //不能调用子类成员
        Dog dog = (Dog) animal;
        //Cat cat = (Cat) animal;
        //指向错误，狗不可指向猫
        dog.play();
        //animal.play();//错误
        //((Dog) animal).play();//正确

        Object obj = new Cat();
        //obj.name = "www";//错误
        //obj.run();//Cannot resolve method 'run' in 'Object'

        //Dog dog1 = (Dog) obj;
        //指向错误，猫不可指向狗
        //dog1.play();

    }
}
