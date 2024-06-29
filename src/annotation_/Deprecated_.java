package annotation_;

/**
 * @author YikerL
 * 注解_@Deprecated入门
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.cry();//出现中划线代表已过时
        System.out.println(a.n1);
    }
}



@Deprecated
    //代表类过时了，过时不代表不能用
    //不推荐使用，但是仍然可以使用
    //可以在版本升级时过渡使用
class A {
    @Deprecated
    public int n1 = 10;

    @Deprecated
    public void cry() {

    }
}