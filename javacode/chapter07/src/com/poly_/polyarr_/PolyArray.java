package com.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {

        Person persons[] = new Person[5];
        persons[0] = new Person("king", 18);
        persons[1] = new Student("Jack", 8,88.5);
        persons[2] = new Student("Emily", 9,100);
        persons[3] = new Teacher("Smith", 35,6666);
        persons[4] = new Teacher("Mike", 44,8888);

//        System.out.println(persons[0].say());
//        System.out.println(persons[1].say());
//        System.out.println(persons[2].say());
//        System.out.println(persons[3].say());
//        System.out.println(persons[4].say());

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say());
            //编译类型都是person,运行类型根据情况来
            if(persons[i] instanceof Student) {
                //((Student)persons[i]).study();//向下转型
                Student student = (Student)persons[i];
                student.study();
            } else if(persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();
            } else {
                continue;
            }
        }

//        for (int j = 0; j < persons.length; j++) {
//            ((Teacher) persons[j]).teach();//转型时会出错
//            //Teacher persons[j] = (Teacher) persons[j];//错误写法
//        }
    }
}
