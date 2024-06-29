package enum_;

//枚举

public class Enumeration01 {
    public static void main(String[] args) {

        //Season spring = new Season("春天", "万物复苏");
        //Season summer = new Season("夏天", "烈日炎炎");
        //Season autumn = new Season("秋天", "秋高气爽");
        //Season winter = new Season("冬天", "冰天雪地");

        System.out.println(Season.SUMMER);
    }
}

//自定义枚举
//1.将构造器私有化，防止直接被new
//2.去掉setXXX方法，防止属性被修改
//3.在内部创建固定的对象
//4.优化：增加final修饰符
class Season {
    private String name;
    private String desc;//对于季节的描述

    public final static Season SPRING = new Season("春天", "万物复苏");
    public final static Season SUMMER = new Season("夏天", "烈日炎炎");
    public final static Season AUTUMN = new Season("秋天", "秋高气爽");
    public final static Season WINTER = new Season("冬天", "冰天雪地");

    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return name + desc;
    }
}