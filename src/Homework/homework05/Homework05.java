package Homework.homework05;

import java.util.Scanner;

/**
 * @author YikerL
 */
public class Homework05 {
    public static void main(String[] args) {
        String road = "路";
        Scanner scanner = new Scanner(System.in);


        Person tang = new Person("唐僧", new Horse());
        tang.passRiver();
        tang.passRoad();
        tang.passFireMountain();
    }
}
