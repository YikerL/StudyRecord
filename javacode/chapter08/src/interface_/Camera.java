package interface_;


//抽象类去实现接口时可以不实现接口的方法
//abstract class Camera implements Usbinterface{}

public class Camera implements Usbinterface{
    @Override
    public void hi() {

    }

    @Override
    public void start() {
        System.out.println("camera开始工作");
    }

    @Override
    public void stop() {

    }

    @Override
    public void ok() {

    }
}
