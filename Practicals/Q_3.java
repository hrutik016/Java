//fibonacci series

import java.util.*;
public class Q_3 {
    public static void main(String[] args) {
        int x1,x2,ch;
        Scanner S = null;
        S = new Scanner(System.in);
        System.out.print("Enter the Integer value : ");
        ch = S.nextInt();

        x1 = 1;
        x2 = 1;

        System.out.println(x1);
        System.out.println(x2);

        for(int i = 0; i < ch ; i++ ){
            int sum = 0;
            sum = x1 + x2;

            System.out.println(sum);

            x1 = x2;
            x2 = sum;
        }
        S.close();
    }
}
