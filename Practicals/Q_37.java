public class Q_37 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("1. " + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2. " + e);
        }
    }
}
