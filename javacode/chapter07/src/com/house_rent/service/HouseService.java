package com.house_rent.service;

import com.house_rent.domain.House;

/**
 * 业务层
 * 1.创建一个数组 houses【】保存房屋信息
 * 2.响应HouseView的调用
 * 3.完成对房屋信息的各种操作
 *   （create）（read/）（update）（delate）
 */

public class HouseService {
    private House[] houses;
    private int houseNum = 1;//记录当前有多少个信息
    private int idNum = 1;//记录新房屋信息的编号

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "110", "山西省" ,2000, "已出租");
    }

    //list方法，
    public House[] list() {
        return houses;
    }


    //add方法H
    public void addHouse(House newHouse) {
        if(houseNum < houses.length) {
            houses[houseNum++] = newHouse;
            newHouse.setId(++idNum);//更新newHouse的id号
        } else {//当数组容量不够时动态扩容
            House[] temp = new House[houseNum];
            for (int i = 0; i < temp.length-2; i++) {
                temp[i] = houses[i];
            }
            temp[houseNum - 1] = newHouse;
            houses = temp;
            houseNum++;
            newHouse.setId(++idNum);//更新newHouse的id号
        }

        //houses[houseNum++] = newHouse;
        //newHouse.setId(houseNum);//更新newHouse的id号
    }

}
