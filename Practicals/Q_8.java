import java.util.*;
public class Q_8 {
    public static void main(String[] args) {
        int x1,x2,x3;        
        Scanner S = null;
        S = new Scanner(System.in);

        System.out.print("Enter the value for X1: ");
        x1 = S.nextInt();

        System.out.print("Enter the value for X2: ");
        x2 = S.nextInt();

        System.out.print("Enter the value for X3: ");
        x3 = S.nextInt();

        if(x1 > x2 && x1 > x3){
            System.out.println("X1 is biggest !!");
        }
        else if(x2 > x1 && x2 > x3){
            System.out.print("X2 is biggest !!");
        }
        else{
            System.out.println("X3 is biggest !!");
        }

        S.close();
    }
}
