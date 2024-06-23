package com.extends_.details;

public class Sub extends Base {
    public Sub() {

        //super();
        //默认有一个super()写不写都有
        //默认调用父类的无参构造器

        super("Jack");
        System.out.println("sub...");
    }

    public Sub(int xxx) {
        super("Tom");

        //do nothing
        System.out.println("do nothing");
    }


    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();//private
        System.out.println("n4=" + getN4());
        callTest400();
        System.out.println("OK");
    }
}
