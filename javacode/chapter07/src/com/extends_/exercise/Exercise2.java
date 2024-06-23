package com.extends_.exercise;

public class Exercise2 {
    public static void main(String[] args) {

        PC pc = new PC();
        pc.setCPU("xxx");
        pc.setMemory("金士顿");
        pc.setDisk("3060");
        pc.setBrand("惠普");
        pc.printPC();
        //"xxx","金士顿","3060","惠普"

        System.out.println("=======================");
        NotePad notePad = new NotePad("yyy", "64G", "4090", "blue");
        notePad.printNotePad();
    }
}

class Computer {
    private String CPU;
    private String memory;
    private String disk;

    public Computer() {
    }

    public Computer(String CPU, String memory, String disk) {
        this.CPU = CPU;
        this.memory = memory;
        this.disk = disk;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getDetails() {
        return CPU + " " + memory + " " + disk;
    }
}


class PC extends Computer {
    private String brand;

    public PC() {

    }

    public PC(String CPU, String memory, String disk, String brand) {
        super(CPU, memory, disk);
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void printPC() {
        System.out.println(getDetails() + " " + brand);
    }

}


class NotePad extends Computer {
    private String color;

    public NotePad(String CPU, String memory, String disk, String color) {
        super(CPU, memory, disk);
        this.color = color;
    }
    public void printNotePad() {
        System.out.println(getDetails() + " " + color);
    }
}
