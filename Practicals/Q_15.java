import java.util.*;
public class Q_15 {
    public static void main(String[] args) { 
        int x;
        int[] arr1 = new int[10];
        Scanner S = null;
        S = new Scanner(System.in);
        System.out.print("Enter the no: ");
        x = S.nextInt();

        for(int i=0; i < x; i++){
            arr1[i] = S.nextInt();
        }

        for (int i = 0; i < x; i++){
            for(int j = i+1; j < x; j++){
                int temp = 0;
                if(arr1[i] > arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for (int i =0; i < x; i++){
            System.out.print(arr1[i] + " ");
        }

        S.close();
        
    }
}
