package interface_;

//如果一个类 implements实现 接口
//需要将该接口的全部抽象方法都实现
public class Phone implements Usbinterface{

    @Override
    public void hi() {

    }

    @Override
    public void start() {
        System.out.println("phone start");
    }

    @Override
    public void stop() {
        System.out.println("phone stop");
    }

    @Override
    public void ok() {

    }

    public void call() {
        System.out.println("打电话");
    }
}
