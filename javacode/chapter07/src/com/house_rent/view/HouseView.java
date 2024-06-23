package com.house_rent.view;

import com.house_rent.domain.House;
import com.house_rent.service.HouseService;
import com.house_rent.utils.Utility;

/**
 * 1.显示主菜单 mainMenu
 * 2.接收用户输入
 * 3.调用HouseService完成对房屋信息的操作
 */

public class HouseView {

    private boolean loop = true;//控制菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(3);

    //显示房屋信息功能
    public void listView() {
        System.out.println("=========房屋信息列表=========");
        System.out.println("编号\t\t屋主\t\t电话\t\t地址\t\t月租\t\t状态");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("=========信息显示完毕=========");
    }

    //新增房屋信息功能
    public void addHouseView() {
        System.out.println("=========添加房屋=========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String adress = Utility.readString(10);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态(已出租/未出租)：");
        String state = Utility.readString(2);

        House house = new House(0, name, phone, adress, rent, state);
        houseService.addHouse(house);
    }

    //mainMenu 主菜单
    //listHouse 界面
    public  void mainMenu() {

        do {
            System.out.println("=========房屋出租系统主菜单=========");
            System.out.println("\t\t\t1.显示房屋信息");
            System.out.println("\t\t\t2.查找房屋信息");
            System.out.println("\t\t\t3.新增房屋信息");
            System.out.println("\t\t\t4.删除房屋信息");
            System.out.println("\t\t\t5.修改房屋信息");
            System.out.println("\t\t\t6.退出程序");
            System.out.print("请选择(1-6)");
            key = Utility.readChar();
            switch(key) {
                case '1':
                    listView();
                    break;
                    case '2':
                    System.out.println("查找房屋信息");
                    break;
                case '3':
                    addHouseView();
                    break;
                case '4':
                    System.out.println("删除房屋信息");
                    break;
                case '5':
                    System.out.println("修改房屋信息");
                    break;
                case '6':
                    loop = false;
                    System.out.println("退出");
                    break;
//                default :
//                    System.out.println("请输入正确的操作（1-6）");
            }
        }while(loop);



    }
}
