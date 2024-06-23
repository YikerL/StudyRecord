package codeblock_;

public class Detail02 {
    public static void main(String[] args) {
        A a = new A();//l2先输出，l1后输出
    }
}


class A {

    private int n2 = getN2();//普通属性初始化

    private static int n1 = getN1();//静态属性初始化

    {
        System.out.println("A 普通代码块被调用");//l4
    }

    static {
        System.out.println("A 静态代码块被调用");//l1
    }

    public static int getN1() {
        System.out.println("getN1()被调用");//l2
        return 100;
    }

    public int getN2() {
        System.out.println("getN2()被调用");//l3
        return 88;
    }

    public A() {
        System.out.println("无参构造器被调用");
    }
}