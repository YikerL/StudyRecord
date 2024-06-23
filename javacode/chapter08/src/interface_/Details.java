package interface_;

public class Details {
    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.hi();

        System.out.println(IB.n1);
    }
}


interface IB{
    int n1 = 10;
    // <==> public static final int n1 = 10;
    void hi() ;
}
interface IC{
    void say() ;
}

//接口可以继承其他接口，但是不能继承其他的类
interface ID extends IB,IC {}

//一个类同时可以实现多个接口
class Tom implements IB,IC {
    @Override
    public void hi(){

    };

    @Override
    public void say() {

    }
}

