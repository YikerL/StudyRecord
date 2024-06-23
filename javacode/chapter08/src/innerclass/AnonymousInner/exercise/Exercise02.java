package innerclass.AnonymousInner.exercise;

public class Exercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            //传递了一个 实现了Bell接口 的匿名内部类
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        System.out.println("\n===============\n");

        new Cellphone().alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}


interface Bell {
    void ring();
}

class Cellphone {
    public void alarmClock(Bell bell) {
        System.out.println(bell.getClass());
        bell.ring();
    }
}