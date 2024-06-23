package interface_;

public class Exercise02 {

}

interface AA {
    int x = 0;
}

class BB {
    int x = 1;
    int y = 1;
}

class CC extends BB implements AA {
    public void pX() {
        //System.out.println(x);//对x的引用不明确
        System.out.println(AA.x);//访问接口的x
        //System.out.println(BB.x);
        System.out.println(super.x);//访问父类的x
        System.out.println(y);
        System.out.println(AA.x);
    }

    public static void main(String[] args) {
        new CC().pX();
    }
}