import java.util.*;

public class Q_12 {
    public static void main(String[] args) {
        int x1,x2;
        Scanner S = null;
        S = new Scanner(System.in);

        System.out.println();
        System.out.println("---- Arthmetic Operators ----");
        System.out.println();

        System.out.print("Enter the First No: ");
        x1 = S.nextInt();

        System.out.print("Enter the Second No: ");
        x2 = S.nextInt();

        System.out.println("x1 + x2 = " + (x1 + x2));

        System.out.println("x1 - x2 = " + (x1 - x2));

        System.out.println("x1 * x2 = " + (x1 * x2));

        System.out.println("x1 / x2 = " + (x1 / x2));

        System.out.println("x1 % x2 = " + (x1 % x2));

        System.out.println();
        System.out.println("---- Logical Operators ----");
        System.out.println();


        //&& operator
        System.out.println("(5 > 3) && (8 > 5) ---> " + ((5 > 3) && (8 > 5)));      //true

        System.out.println("(5 > 3) && (8 < 5) ---> " + ((5 > 3) && (8 < 5)));      //false


        //|| operator
        System.out.println("(5 < 3) || (8 > 5) ---> " + ((5 < 3) || (8 > 5)));      //true

        System.out.println("(5 > 3) || (8 < 5) ---> " + ((5 > 3) || (8 < 5)));      //true

        System.out.println("(5 < 3) || (8 < 5) ---> " + ((5 < 3) || (8 < 5)));      //false

        //! operator

        System.out.println("!(5 == 3) ---> " + (!(5 == 3)));        //true

        System.out.println("!(5 > 3) ---> " + (!(5 > 3)));       //false

        System.out.println();
        System.out.println("---- Bitwise Operators ----");
        System.out.println();

        System.out.println();
        System.out.println("---- Ternary Operators ----");
        System.out.println();

        System.out.println();
        System.out.println("---- Relational Operators ----");
        System.out.println();

        S.close();
    } 
}
