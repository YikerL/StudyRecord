package single;

public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}


class GirlFriend {

    private String name;
    ////饿汉式==>对象通常是重量级对象
    //1构造器私有化
    private GirlFriend(String name) {
        this.name = name;
    }
    //2在类的内部创建
    private static GirlFriend amy = new GirlFriend("amy");
    //3提供一个公共的static方法，返回amy对象
    public static GirlFriend getInstance() {
        return  amy;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}