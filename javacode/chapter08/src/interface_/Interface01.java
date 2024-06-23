package interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
       // Camera camera = new Camera();

        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("=========");
       // computer.work(camera);

        //接口不可以被实例化
        //Usbinterface usbinterface = new Usbinterface();

        Usbinterface u1 = new Phone();
        //接口类型的变量可以指向实现了接口的类的对象实例

        Usbinterface[] usb = new Usbinterface[5];
        usb[0] = new Phone();
        usb[1] = new Camera() ;
        usb[2] = new Phone();
        usb[3] = new Camera();
        usb[4] = new Phone();

        for (int i = 0; i < usb.length; i++) {
            usb[i].start();
            if(usb[i] instanceof Phone) {
                ((Phone) usb[i]).call();
            }
        }

    }
}
