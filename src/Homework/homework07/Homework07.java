package Homework.homework07;

/**
 * @author YikerL
 */
public class Homework07 {
    public static void main(String[] args) {

        Color color = Color.valueOf("RED");

        Color black = Color.BLACK;

        switch (color) {
            case RED:
                System.out.print("红色：");
                color.show();
                break;
            case BLUE:
                System.out.print("蓝色：");
                color.show();
                break;
            case BLACK:
                System.out.print("黑色：");
                color.show();
                break;
            case GREEN:
                System.out.print("绿色：");
                color.show();
                break;
            case YELLOW:
                System.out.print("黄色：");
                color.show();
                break;
            default:
                System.out.println("颜色不匹配");
                break;
        }
    }
}
