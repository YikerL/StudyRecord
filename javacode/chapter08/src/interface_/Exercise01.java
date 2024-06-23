package interface_;

public class Exercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(A.a);
        System.out.println(B.a);
    }
}

interface A {
    int a = 10;
}

class B implements A {}