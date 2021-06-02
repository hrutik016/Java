import java.util.*;
class Shape{
    double base, height;

    void Get_data(double x1, double x2){
        base = x1;
        height = x2;
    }

    void Display_area(){
        System.out.println("The area of is: " + (base * height));
    }
}// end of class shape

public class Q_25 {
    public static void main(String[] args) {

        Scanner POP = new Scanner(System.in);
        System.out.print("Enter the Base value: ");
        double a = POP.nextDouble();
        System.out.print("Enter the Height value:  ");
        double b = POP.nextDouble();
        
        Triangle T = new Triangle();
        T.Get_data(a, b);
        T.Display_area();

        System.out.print("Enter the Length value: ");
        double x = POP.nextDouble();
        System.out.print("Enter the Breadth value:  ");
        double y = POP.nextDouble();

        Rectangle R = new Rectangle();
        R.Get_data(x, y);
        R.Display_area();
    }
}// end of main class

class Triangle extends Shape {
    void Display_area(){
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}// end of class triangle

class Rectangle extends Shape {
    void Display_area(){
        System.out.println("Area of Rectangle is: " + (base * height));
    }
}// end of class rectangle