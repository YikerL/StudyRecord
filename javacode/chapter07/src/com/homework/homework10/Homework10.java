package com.homework.homework10;

public class Homework10 {
    public static void main(String[] args) {
        Person[] per = new Person[4];
        per[0] = new Student("Jack", '男', 13, "1862310220");
        per[1] = new Student("Emily", '女', 12, "1862310201");
        per[2] = new Teacher("Smith", '男', 35, 8);
        per[3] = new Teacher("King", '女', 47, 20);

        per[1].perPrint();
        per[2].perPrint();

//        Person person = new Person();
//        for (int i = 0; i < per.length - 1; i++) {
//            for (int j = 0; j < per.length - i -1; j++) {
//                if(per[j].getAge() <= per[j+1].getAge()) {
//                    person = per[j];
//                    per[j] = per[j+1];
//                    per[j+1] = person;
//                }
//            }
//        }
        Homework10 homework10 = new Homework10();
        homework10.bubbleSort(per);

        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i]);
        }


        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i].getName());
            per[i].work(per[i]);
        }
    }

    //排序
    public void bubbleSort(Person[] per) {
        Person person = new Person();
        for (int i = 0; i < per.length - 1; i++) {
            for (int j = 0; j < per.length - i -1; j++) {
                if(per[j].getAge() <= per[j+1].getAge()) {
                    person = per[j];
                    per[j] = per[j+1];
                    per[j+1] = person;
                }
            }
        }
    }
}
