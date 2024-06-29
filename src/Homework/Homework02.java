package Homework;

/**
 * @author YikerL
 */
public class Homework02 {
    public static void main(String[] args) {
        Frock.getNextNum();
        System.out.println(Frock.getCurrentNum());
        Frock.getNextNum();
        System.out.println(Frock.getCurrentNum());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSeriaNumber());
        System.out.println(frock2.getSeriaNumber());
        System.out.println(frock3.getSeriaNumber());
    }
}


class Frock {
    private static  int currentNum = 100000;
    private int seriaNumber;


    public Frock() {
        seriaNumber = getNextNum();
    }

    public int getSeriaNumber() {
        return seriaNumber;
    }

    public static int getCurrentNum() {
        return currentNum;
    }

    public static int getNextNum() {
        return currentNum += 100;
    }


}
