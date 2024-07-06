package Homework;

import jdk.nashorn.internal.ir.CallNode;

/**
 * @author YikerL
 */
public class Homework03 {
    public static void main(String[] args) {

        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public int work(int n1, int n2) {
                return n1 + n2;
            }
        },5 ,7);

    }
}

interface Calculator {
    public int work(int n1, int n2) ;
}

class Cellphone  {

    public void work() {
        System.out.println("计算器工作中...");
    }

    public void testWork(Calculator calculator, int n1, int n2) {
        int result = calculator.work(n1, n2);
        System.out.println("结果=" + result);
    }
}
