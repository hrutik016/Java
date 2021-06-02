class Circle{
    double area, PI = 3.14f;

    double area1(double r){
        return PI * r * r;
    }

    void Circle (double r){
        area = area1(r);
        System.out.println("The Circle is centered at origin and area is " + area);
    }

    void Circle (double x, double y, double r){
        area = area1(r);
        System.out.println("The Circle is (" + x + ", " + y + ") at origin and area is " + area);
    }
}
public class Q_21 {
    public static void main(String[] args) {
        Circle obj1 = new Circle();
        Circle obj2 = new Circle();

        obj1.Circle(1.0f);
        obj2.Circle(3.0f, 5.0f, 1.0f);
    }
}
