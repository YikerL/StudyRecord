package enum_;

/**
 * @author YikerL
 * enum关键字的使用
 */
public class Enumeration02 {
    public static void main(String[] args) {
        //Enum

        Season_ season = Season_.valueOf("SPRING");


    }
}

enum Season_ {//默认继承父类Enmu


    //使用关键字enum代替class
    //格式： 常量名1(实参1，实参2，实参...),常量名2(实参1，实参2，实参...),常量名3...
    //定义的常量对象写在前面

    SPRING("春天", "万物复苏"),
    SUMMER("夏天", "烈日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地"),
    /*TEST*/;

    private String name;
    private String desc;//对于季节的描述

    Season_() {
    }

    private Season_(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

//    public final static Season_ SPRING = new Season_("春天", "万物复苏");
//    public final static Season_ SUMMER = new Season_("夏天", "烈日炎炎");
//    public final static Season_ AUTUMN = new Season_("秋天", "秋高气爽");
//    public final static Season_ WINTER = new Season_("冬天", "冰天雪地");



    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }
}
