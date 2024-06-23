package abstract_;

//模板设计模式
public class Test {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.calculateTime();
        BB bb = new BB();
        bb.calculateTime();
    }
}

abstract class Template {
    public void calculateTime() {
        long start = System.currentTimeMillis();
        job();
        long end = System.currentTimeMillis();
        System.out.println("工作时间=" + (end - start));
    }

    public abstract void job();
}

class AA extends Template {
    @Override
    public void job() {
        int num = 0;
        for (int i = 0; i <= 1000000; i++) {
            num += i;
        }
    }
}

class BB extends Template {
    @Override
    public void job() {
        int num = 1;
        for (int i = 1; i <= 300000; i++) {
            num *= i;
        }
    }
}