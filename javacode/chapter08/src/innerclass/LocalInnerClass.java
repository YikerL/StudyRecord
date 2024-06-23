package innerclass;

/**
 * 局部内部类//本质上还是一个类，该有的东西都可以有
 */

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.m1();
        System.out.println(outer);
    }
}

/**
 * 局部内部类//◈本质上还是一个类，该有的东西都可以有
 * 1.定义在外部类的局部位置，通常在方法
 * 2.可以直接访问外部类的所有成员，包含私有的
 * 3.不能添加访问修饰符，但是可以使用final修饰
 *(因为它的地位就是一个局部变量，局部变量不能使用修饰符，但是可以使用final修饰)
 * 4.作用域：仅在定义他的方法或代码块内
 * 5.局部内部类可以直接访问外部类的成员
 * 6.外部类在方法中可以创建内部类对象，然后调用内部类的方法
 * 7.外部其他类不能直接访问局部内部类
 * 8.外部类和局部内部类重名时，默认遵循就近原则，
 *  如果像访问外部类的成员，可以使用（外部类名.this.成员）去访问
 */

class Outer {
    private int n1 = 100;

    public void m1() {
        class Inner {//局部内部类
            private int n1 = 300;
            final public void f1() {//加了final就不能被继承了
                System.out.println("内部n1 = " + n1);
                System.out.println("外部n1 = " + Outer.this.n1 );
                System.out.println(Outer.this);
                m2();
            }
        }

        Inner inner01 = new Inner();
        inner01.f1();

//        class Inner02 extends Inner01{
//
//        }
    }
    private void m2() {
        System.out.println("hi!");
    }
}
