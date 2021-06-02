abstract class Figure{
    static double height, width;

    static void get_data(double h, double w){
        Figure.height = h;
        Figure.width = w;   
    }
    abstract void area();
}

class Triangle extends Figure{
    void area()
    {
        double area = 0.5 * height * width;
        System.out.println("Area of triangle: " + area);
    }
}

class Square extends Figure{
    void area()
    {
        double area = height * width;
        System.out.println("Area of Square: " + area);
    }
}
public class Q_27 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.get_data(12.0, 14.0);
        t1.area();

        Square sq1 = new Square();
        sq1.get_data(5.0, 5.0);
        sq1.area();
    }
}
