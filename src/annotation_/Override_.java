package annotation_;

/**
 * @author YikerL
 * 注解_@Override入门
 */
public class Override_ {
}


class Father {

    public void fly() {

    }
}

class Son extends Father {

    //@Override没写也是重写了父类的对应方法
    //当有@Override时就会判断是不是真的重写了父类方法，如果没写则报错
    @Override
    public void fly() {
        super.fly();
    }
}