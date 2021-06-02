package Q_32;
interface shape{
    public void calcArea(double s);
}

class square implements shape{
    public void calcArea(double side){
        double Area = side * side;
        System.out.println("Area of Square: " +  Area);
    }
}

class circle implements shape{
    public void calcArea(double side){
        double Area = 3.14 * side * side;
        System.out.println("Area of Circle: " + Area);
    }
}

public class Q_32 {
    public static void main(String[] args) {
        square s1 = new square();
        s1.calcArea(10);

        circle c1 = new circle();
        c1.calcArea(5);
    }
}
