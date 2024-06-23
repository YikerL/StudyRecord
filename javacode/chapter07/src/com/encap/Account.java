package com.encap;

public class Account {
    public String name;
    private int key;
    private double deposit;

    public Account() {
    }

    public Account(String name, int key, double deposit) {
        setName(name);
        setKey(key);
        setDeposit(deposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("请输入正确的名字");
            this.name = null;
        }
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        if(key <= 100000 || key >= 999999) {
            System.out.println("请输入六位数密码");
            this.key = 1;
        } else if(key == 666666) {
            System.out.println("密码正确:");
            this.key = key;
        } else if(key != 666666) {
            System.out.println("密码错误:");
            this.key = 0;
        }
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        if(deposit <= 20) {
            System.out.println("存款不得小于20元");
            this.deposit = 0;
        } else {
            this.deposit = deposit;
        }
    }

    public String info() {
        return name + "的存款是" + deposit + "元";
    }
}
