package final_.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle();

        System.out.println(circle.gerArea(3));
    }
}

class Circle {
    private double radius;//半径
    //private final static double PI = 3.14;
    private final static double PI ;

    private Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }

    public Circle() {
    }

    static {
        PI = 3.14;
    }

    public double gerArea(double radius) {
        return PI * radius * radius;
    }
}