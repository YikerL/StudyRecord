package Homework.homework05;

/**
 * @author YikerL
 */
public class Person {
    private String name;
    private Vehicles myVehicle;

    public Person(String name, Vehicles myVehicle) {
        this.name = name;
        this.myVehicle = myVehicle;
    }

    public void passRiver() {
        myVehicle = Factory.getBoat();
        myVehicle.work();
    }
    public void passRoad() {
        myVehicle = Factory.getHorse();
        myVehicle.work();
    }
    public void passFireMountain() {
        myVehicle = Factory.getAirplane();
        myVehicle.work();
    }
}
