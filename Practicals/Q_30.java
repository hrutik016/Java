public class Q_30 {
    static double avg;
    public static void main(String[] args) {
        D obj = new D();
        avg = (obj.x + obj.y + obj.z + obj.w) / 4;
        System.out.println("Average of 4 nos: " + avg);
    }
}
class A extends Q_29{
    double y = 10;
}
class B extends A{
    double z = 15;
}
class C extends B{
    double w = 20;
}
class D extends C{
    double x = 5;
}
