package com.poly_.Detail_;

public class Detail02 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);
        System.out.println(bb instanceof AA);
        //System.out.println(bb instanceof CC);

    }
}

class AA {}

class BB extends AA {}

class CC {}
