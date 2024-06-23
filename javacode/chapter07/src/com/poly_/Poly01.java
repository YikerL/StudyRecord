package com.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master m1 = new Master("jack");

        Dog dog = new Dog("大黄");
        Bone bone = new Bone("牛骨头");
        m1.feed(dog, bone);

        Fish fish = new Fish("鲤鱼");
        Cat cat = new Cat("jerry");
        m1.feed(cat, fish);

        //Animal a1 = new Dog("sss");
    }
}