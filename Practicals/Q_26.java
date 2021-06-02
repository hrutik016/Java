
class figure{
    private static double height, width;
    
    static void get_data(double h, double w){
        figure.height = h;
        figure.width = w;  
    }

    static double area() {
        return height * width;
    }
}

class triangle extends figure{
    void area_t() {
        System.out.println("Area of triangle is: " + 0.5 * figure.area());
    }
}

class square extends figure{
    void area_s() {
        System.out.println("Area of square is: " + figure.area());
    }
}

public class Q_26{
    public static void main(String args[]){
        
        triangle tri1 = new triangle();
        tri1.get_data(7.5,5.0);
        tri1.area_t();

        square sq1 = new square();
        sq1.get_data(2.75, 14.0);
        sq1.area_s();
    }
}
