public class Q_13 {
    public static void main(String[] args) {
        int i = 32;
        String s1 = "" + i;
        System.out.println("s1 = " + s1);

        double d = 876.54;
        String s2 = String.valueOf(d);
        System.out.println("s2 = " + s2);

        float f = 156.8f;
        String s3 = Float.toString(f);
        System.out.println("s3 = " + s3);

        String s4 = "" + i + d;

        System.out.println("s4 = " + s4);
        int n = s4.indexOf('.');
        System.out.println(n + " Digits before decimal point of s4 string.");
        System.out.println(s4.length() - n - 1
                + " Digits after decimal point of s4 string.");
    }
}