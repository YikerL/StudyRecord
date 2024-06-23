package innerclass.AnonymousInner.exercise;

public class Exercise01 {
    public static void main(String[] args) {

        f1(new IA(){
              @Override
              public void show() {
                  System.out.println("show time");
              }
            });//将匿名内部类当作实参直接传递

        //传统方法
        f1(new Car());

    }

    public static void f1(IA ia) {//形参是接口类型
        ia.show();
    }
}


interface IA {
    void show();
}

class Car implements IA {
    @Override
    public void show() {
        System.out.println("啦啦啦啦");
    }
}
