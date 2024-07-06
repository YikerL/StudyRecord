package Homework.homework05;

import Homework.homework01.Animal;

/**
 * @author YikerL
 */
public class Factory {
    private static Horse HORSE = new Horse();

    private Factory() {
    }//马只有一只，防止被更改

    public static Horse getHorse() {
        return HORSE;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Airplane getAirplane() {
        return new Airplane();
    }
}
