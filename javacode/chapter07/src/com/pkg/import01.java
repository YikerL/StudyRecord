package com.pkg;

//import java.util.Scanner;//表示将java.util包下Scanner类导入
//import java.util.*;//表示将java.util包下的所有类都导入


import java.util.Arrays;

public class import01 {
    public static void main(String[] args) {

        //使用系统提供的Arrays完成数组排序
        int[] arr = {4, 2, 6, 1, 15};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
