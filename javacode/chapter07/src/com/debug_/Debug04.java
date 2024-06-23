package com.debug_;

import java.util.Arrays;

//演示动态下断点
public class Debug04 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, -7};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
        System.out.println("hello700");
    }
}
