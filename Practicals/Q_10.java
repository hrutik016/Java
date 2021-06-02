//pattern

import java.util.*;

public class Q_10 {
    public static void main(String[] args) {
        int x;
        Scanner S = null;

        S = new Scanner(System.in);

        System.out.print("Enter the no: ");
        x = S.nextInt();

        for(int i = x-1; i >= 0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("1" + " ");
            }
            System.out.println();
        }

        S.close();
    }
}
