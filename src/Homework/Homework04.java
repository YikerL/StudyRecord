package Homework;

/**
 * @author YikerL
 */
public class Homework04 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A {
    private String name = "Tom";

    public void f1() {
        class B {
            private String NAME = "Jerry";
            public void show() {
                System.out.println(NAME + '\n' + A.this.name);
            }
        }

        B b = new B();
        b.show();
    }

}