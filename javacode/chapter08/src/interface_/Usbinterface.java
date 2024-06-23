package interface_;

public interface Usbinterface {
    //属性
    public int n1 = 10;
    //方法
    //在接口中，抽象方法可以省略abstract关键字
    //在接口中所有方法是public方法，可以省略public关键字
    public abstract void hi();
    public void start();
    void stop();

    //在jdk8后，可以有默认实现方法，需要用default关键字修饰
    public default void ok() {
        System.out.println("ok...");
    }
    //在jdk8后，可以有静态方法
    public static void cry() {
        System.out.println("cry...");
    }
}




