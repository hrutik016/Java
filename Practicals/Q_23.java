public class Q_23 {
    int value = 50;

    void pbv_change(int v){
        v = v + 100;       
    }

    void pbr_change(Q_23 obj){
        obj.value = obj.value + 100;
    }
    public static void main(String[] args) {
        Q_23 o1 = new Q_23();

        System.out.println("----Pass By Value----");
        System.out.println();
        
        System.out.println("Before change -> " + o1.value);
        o1.pbv_change(100);
        System.out.println("After change -> " + o1.value);

        Q_23 o2 = new Q_23();
        System.out.println("----Pass By Reference----");

        System.out.println();
        
        System.out.println("Before change -> " + o2.value);
        o2.pbr_change(o2);
        System.out.println("After change -> " + o2.value);
    }
}
