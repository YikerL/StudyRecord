package innerclass.AnonymousInner;

/**
 * 匿名内部类
 */

public class AnonymousInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.method();
    }
}


class Outer {//外部类
    private int n1 = 10;//属性
    public void method() {//方法
        //基于接口的匿名内部类
        //并不需要专门创建一个类，简化开发，节省空间
        //tiger的编译类型:IA
        //tiger的运行类型:匿名内部类 Outer$1
        /*
            底层
            class XXXX implement IA {
                //XXXX底层系统会自动分配名字 Outer$1
                //外部类名字 + $1
                @Override
                public void cry() {
                    System.out.println("老虎叫唤");
                }
            }
         */
        //jdk底层在创建匿名内部类Outer$1后立即创建一个Outer$1实例，并把地址返回给tiger
        //匿名内部类Outer$1只能使用一次，但是tiger对象可以重复使用
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤");
            }
        };
        System.out.println(tiger.getClass());//tiger的运行类型
        tiger.cry();
        tiger.cry();
        //new Outer$1();//错误

        System.out.println("\n====================================\n");

        //基于类的匿名内部类
        //father编译类型:Father
        //father运行类型:Outer$02
        /*
            底层
            class Outer$02 extends Father {//Outer$02 是系统自动分配的名字
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //Father father = new Father("jack") {};//普通类的方法可以不实现
        Father father = new Father("jack") {
            //形参列表("jack")会传给Father的构造器
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };// ‘ ; ’不能少
        System.out.println("father的运行类型" + father.getClass());
        father.test();
        Father father02 = new Father("tom");
        System.out.println("father02的运行类型" + father02.getClass());

        //基于抽象类的匿名内部类
        //抽象类的方法必须实现
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
        System.out.println(animal.getClass());//animal的运行类型Outer$3
    }
}

interface IA {//接口
    public void cry();
}

class Father {//父类
    public Father(String name) {//构造器
        System.out.println("以父之名 = " + name);
    }
    public void test() {//方法
    }
}

abstract class Animal {
    public abstract void eat();
}