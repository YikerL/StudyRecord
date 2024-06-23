package com.encap;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入密码:");
        int key = scanner.nextInt();
        Account jack = new Account("Jack", key, 8000);

//        for (int i = 0; i < 3; i++) {
//            System.out.println("请重新输入密码，还有" + (2 - i) + "次机会");
//            key = scanner.nextInt();
//            new Account("Jack", key, 8000);
//            if(key == jack.getKey()) {
//
//            }
//        }

        if(jack.getKey() == 1) {
            //System.out.println("密码长度必须为六个字符");
        } else if(jack.getKey() == 0){
            //System.out.println("");
        } else {
            System.out.println(jack.info());
        }

    }
}
