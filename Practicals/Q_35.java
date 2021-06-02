import java.io.File;
import java.io.FileNotFoundException;

public class Q_35{
    public static void main(String[] args) {
        /**
        Arithemactic Expression
        */
        try{
            int a = 1 / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

        /**
        StringIndexOutofBoundsException
        */

        try{
             String ch = "Hrutik";
             System.out.println(ch.charAt(6));
        }
        catch (StringIndexOutOfBoundsException e){
             System.out.print(e);
        }

        /**
          ArrayIndexOutOfBoundsExpection
        */

        try{
            int arr[] = new int[5];
            int sum = 0;

            for(int i = 0; i < 5; i++)
            {
                sum += arr[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        /**
        FileNotFoundException
        */

        try{
            File file = new File ("D:\\Test.txt");
            
            if(!file.exists())
                throw new FileNotFoundException();
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }

        /**
        NumberFormatException
        */

        try{
            String s = null;
            Integer.parseInt(s);
        }
        catch (NumberFormatException e){
            System.out.println(e);
        }
    }
}