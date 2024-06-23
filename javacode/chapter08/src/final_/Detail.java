package final_;

public class Detail {
    public static void main(String[] args) {

    }
}

class AA {
    //final修饰的属性必须赋初值，且以后不可更改
    //1可以在定义时赋值
    //2可以在构造器中赋值
    //3也可以在代码块中赋值
    public final double TAX_RATE = 0.1;
    public final double TAX_RATE2 ;
    public final double TAX_RATE3 ;

    public AA() {
        TAX_RATE2 = 0.2;
    }
    {
        TAX_RATE3 = 0.3;
    }
}

class BB {
    //final修饰静态属性时，初始化的位置只能是
    //1定义时赋值
    //2在静态代码块中赋值
    //不可以在构造器中赋值

    public static final double XX_X = 1;
    public static final double XX_Y ;
    static {
        XX_Y = 2;
    }
}
