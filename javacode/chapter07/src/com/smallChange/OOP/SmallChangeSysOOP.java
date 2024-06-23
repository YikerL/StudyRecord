package com.smallChange.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {

    //定义相关属性
    private double balance = 0;//账户余额
    private Date date = null;//表示日期
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//对日期格式进行规范
    private double money = 0;//收入/支出金额
    private String note = "";//定义新变量记录消费原因
    String details = "--------明细如下---------";


    //定义相关参数
    private boolean loop = true;
    private char key;//菜单按钮
    private char key0 = 'y';
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        System.out.println("\n=========零钱通菜单========");
        System.out.println("\t\t1 账单明细");
        System.out.println("\t\t2 收    入");
        System.out.println("\t\t3 支    出");
        System.out.println("\t\t4 退    出");
        System.out.println("==========================");

        do{
            System.out.print("请选择1-4: ");
            key = scanner.next().charAt(0);
            switch (key) {
                case '1':
                    this.bill();
                    break;
                case '2':
                    this.income();
                    break;
                case '3':
                    this.expend();
                    break;
                case '4':
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop) ;
        System.out.print("请选择1-4: ");
        key = scanner.next().charAt(0);
        switch (key) {
            case '1':
                this.bill();
                break;
            case '2':
                this.income();
                break;
            case '3':
                this.expend();
            case '4':
                this.exit();
                break;
            default:
                System.out.println("输入有误，请重新输入");
        }
    }

    public void bill() {
        System.out.println(details);
    }
    public void income() {
        System.out.print("收入金额: ");
        money = scanner.nextDouble();//此处需要一个校验
        if(money <= 0) {
            System.out.println("请输入正确的金额");
            return;//退出方法不在执行
        }
        balance += money;
        date = new Date();
        details += "\n收入\t+" + money + "\t" + sdf.format(date) + "\t" +balance;
    }

    public void expend() {
        System.out.print("支出金额: ");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("请输入正确的金额");
            return;
        }
        if(money > balance) {
            System.out.println("存款不足,支出失败");
            return;
        }
        balance -= money;
        date = new Date();
        System.out.print("支出说明: ");
        note = scanner.next();
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" +balance;

    }

    public void exit() {
        System.out.println("是否确认退出y/n");
        boolean key1 = true;
        do{
            key0 = scanner.next().charAt(0);
            if(key0 == 'y') {
                System.out.println("退出零钱通");
                loop = false;
                key1 = false;
            } else if (key0 == 'n') {
                key1 = false;
            } else {
                System.out.println("输入错误，请重新输入y/n");
            }
        } while (key1);
    }
}
