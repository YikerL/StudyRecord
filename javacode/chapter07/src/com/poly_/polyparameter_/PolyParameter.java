package com.poly_.polyparameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Employee e[] = new Employee[4];
        e[0] = new Employee("Jack", 100000);
        e[1] = new Laborer("Mark", 7000);
        e[2] = new Manager("Jully", 12000, 8888);
        e[3] = new Laborer("Bob", 8000);

        for (int i = 0; i < e.length; i++) {
            Test test = new Test();
            test.showEmpAnnual(e[i]);
            test.testWork(e[i]);
        }

        System.out.println("=====================");
        Manager tom = new Manager("Tom", 9000, 10000);
        Test test = new Test();
        test.showEmpAnnual(tom);
        test.testWork(tom);
    }
}
