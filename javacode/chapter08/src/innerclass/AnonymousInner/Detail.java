package innerclass.AnonymousInner;

public class Detail {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.hello();
    }
}

class Outer01 {
    private int age = 88;

    public void hello() {
        Person person = new Person() {
            @Override
            public void hi() {
                System.out.println("你好");
            }
        };//类的定义
        person.hi();//
        System.out.println("\n=====================\n");
        new Person() {//新的匿名内部类
            @Override
            public void ok(String name) {
                System.out.println("撒浪嘿呦" + name);
            }
        }.ok("jack");//匿名内部类本身也是返回对象，直接调用方法
    }
}

class Person {
    public void hi() {

    }
    public void ok(String name) {
        System.out.println("撒浪嘿呦" + name);
    }
}
