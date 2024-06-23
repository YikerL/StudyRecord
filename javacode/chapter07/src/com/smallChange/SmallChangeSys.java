package com.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
       1.完成菜单的打印
       //菜单必须显示一次，因此用 do{}while; 循环
       2.完成账单明细
         plan A：将收入和支出保存到数组
         plan B：可以使用对象
         plan C：直接使用String拼接//简单
       3.完成收入功能
         details:根据需求定义所需变量
       4.完成支出功能
         details：类似支出
       5.退出功能
       6.代码改进
        */
//菜单必须显示一次，因此用 do{}while; 循环
public class SmallChangeSys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //定义相关参数
        boolean loop = true;
        char key;//菜单按钮
        double balance = 0;//账户余额
        Date date = null;//表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//对日期格式进行规范
        double money = 0;//收入/支出金额
        String note = "";//定义新变量记录消费原因
        String details = "--------明细如下---------";
        char key0 = 'y';

        do {
            System.out.println("\n=========零钱通菜单========");
            System.out.println("\t\t1 账单明细");
            System.out.println("\t\t2 收    入");
            System.out.println("\t\t3 支    出");
            System.out.println("\t\t4 退    出");
            System.out.println("==========================");
            System.out.print("请选择1-4: ");

            key = scanner.next().charAt(0);
            //使用switch分支判断
            switch(key) {
                case '1':
                    System.out.println(details);
                    break;
                case '2':
                    System.out.print("收入金额: ");
                    money = scanner.nextDouble();//此处需要一个校验
                    if(money <= 0) {
                        System.out.println("请输入正确的金额");
                        money = scanner.nextDouble();
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收入\t+" + money + "\t" + sdf.format(date) + "\t" +balance;
                    break;
                case '3':
                    System.out.print("支出金额: ");
                    money = scanner.nextDouble();
                    if(money <= 0) {
                        System.out.println("请输入正确的金额");
                        money = scanner.nextDouble();
                    }
                    if(money > balance) {
                        System.out.println("存款不足,支出失败");
                        continue;
                    }
                    balance -= money;
                    date = new Date();
                    System.out.print("支出说明: ");
                    note = scanner.next();
                       details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" +balance;
                    break;
                case '4':
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
                            continue;
                        } else {
                            System.out.println("输入错误，请重新输入y/n");
                        }
                    } while (key1);
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
            }
        } while (loop);

    }
}
