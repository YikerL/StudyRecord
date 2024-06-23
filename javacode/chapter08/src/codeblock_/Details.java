package codeblock_;

public class Details {
    public static void main(String[] args) {
        new AAAA();
    }
}

class BBBB{
    private static int b1 = getB1();
    private int b2 = getB2();

    static{
        System.out.println("BBBB静态代码块被调用");//2
    }
    {
        System.out.println("BBBB普通代码块被调用");//6
    }

    public static int getB1() {
        System.out.println("getB1()被调用");//1
        return 1;
    }
    public  int getB2() {
        System.out.println("getB2()被调用");//5
        return 2;
    }

    public BBBB() {
        System.out.println("BBBB构造器被调用");//7
    }
}

class AAAA extends BBBB{
    private static int a1 =getA1();
    private int a2 = getA2();


    {
        System.out.println("AAAA普通代码块被调用");//9
    }
    static{
        System.out.println("AAAA静态代码块被调用");//4
    }

    public static int getA1() {
        System.out.println("getA1()被调用");//3
        return 100;
    }

    public int getA2() {
        System.out.println("getA2()被调用");//8
        return 200;
    }

    public AAAA() {
        System.out.println("AAAA构造器被调用");//10
    }
}