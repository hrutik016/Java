// to find factorial of the given no.

import java.util.*;

public class Q_7 {
    public static void main(String[] args) {
        int n, i = 1, f = 1;

        Scanner S =null;

        S = new Scanner(System.in);

        System.out.print("Enter the number: ");

        n = S.nextInt();

        while(i < n)
        {
            f = f * i;
            i++;
        }

        System.out.print("The factorial of the given no is: " + f);

        S.close();
    }
}
