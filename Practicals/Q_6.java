// to check if no is odd or even

import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
        int n;

        Scanner S = null;

        S = new Scanner(System.in);

        System.out.print("Enter the value : ");

        n = S.nextInt();

        if(n % 2 == 0)
        {
            System.out.print("Even!!");
        }
        else
        {
            System.out.print("Odd!!");
        }
        S.close();
    }
}
