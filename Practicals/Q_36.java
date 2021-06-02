import java.util.*;

class UnderAgeException extends Exception{
    public String toString(){
        return "Voter is Underage";
    }
}
public class Q_36 {
    public static void main(String[] args) {
        try{
            System.out.println("Enter the Age of the voter: ");
            int age = new Scanner(System.in).nextInt();
            if(age < 18)
            {
                throw new UnderAgeException();
            }
        }
        catch (UnderAgeException e){
            System.out.println(e);
        }
    }
}
