package codeblock_;

public class Detail04 {
    public static void main(String[] args) {
        new X();
    }
}


class X {
    private int n1 = 100;
    private static int n2 = 200;

    private static void x1() {
    }
    private void x2() {
    }
    //静态代码块只能调用静态成员
    //普通代码块可以调用任意成员
    static{
        //System.out.println(n1);//错误
        System.out.println(n2);
        x1();
        //x2();//错误
    }

    {
        System.out.println(n1);//错误
        System.out.println(n2);
        x1();
        x2();
    }


}