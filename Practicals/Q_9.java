// swaping numbers

import java.util.*;

public class Q_9 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping a is: "+a);
        System.out.println("After swapping b is: "+b);

        sc.close();
    }
}