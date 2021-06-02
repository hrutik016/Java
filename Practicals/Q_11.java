import java.util.*;

public class Q_11 {
    public static void main(String[] args) {
        int month;
        Scanner S = null;
        S = new Scanner(System.in);

        System.out.print("Enter the month no: ");
        month = S.nextInt();

        if(month == 12 || month == 1 || month == 2){
            System.out.println("Season -> Winter!");
        }
        else if(month == 3 || month == 4 || month == 5){
            System.out.println("Season -> Spring!");
        }
        else if(month == 6 || month == 7 || month == 8){
            System.out.println("Season  -> Summer!");
        }
        else{
            System.out.println("Season -> Autumn!");
        }

        S.close();
    }
}
