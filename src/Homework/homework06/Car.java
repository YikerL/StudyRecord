package Homework.homework06;

/**
 * @author YikerL
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air{
        public void flow() {
            if(temperature >= 25) {
                System.out.println("吹冷风");
            } else if (temperature <= 10) {
                System.out.println("吹热风");
            } else {
                System.out.println("关闭空调");
            }
        }
    }

    public Air getAir() {
        return new Air();
    }
}
