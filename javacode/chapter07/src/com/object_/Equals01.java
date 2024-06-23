package com.object_;

public class Equals01 {
    public static void main(String[] args) {
        int n1 = 10;
        double n2 = 10.0;

        System.out.println(n1 == n2);
        System.out.println(n1 > n2 ?  1 :  0);


        //查看源码 ctrl + b
        "hello".equals("abc");

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//比较地址，false
        System.out.println(integer1.equals(integer2));//比较值，true


    }
}
