package single;

public class SingleTon02 {
    public static void main(String[] args) {

    }
}

class Cat{
    private String name;
    private static Cat cat;

    ////懒汉式==>使用时创建对象
    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        //当用户使用getInstance()时，才会返回cat对象，
        //后面再次调用时，会返回上次创建的cat对象
        if(cat == null) {
            cat = new Cat("tom");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
