package final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
       // e.rate = 1;//Cannot assign a value to final variable 'rate'
    }
}

//加了final以后，A类不可以再被继承
final class A {

}

//class B extends A {}

class C {
    //加了final后，子类不可以重写该方法
    public final void hi() {
        System.out.println(1);
    }
}

class D extends C{
//    @Override
//    public void hi() {
//        //'hi()' cannot override 'hi()' in 'final_.C'; overridden method is final
//        System.out.println(2);
//    }
}

class E {
    //加了final后，不可以改变最终变量rate的值
    public final double rate = 0.1;
}

class F {
    public void hi() {
        final double NUM = 0.9;
        //加了final以后，局部变量NUM的值不可更改
        System.out.println(NUM);
    }
}