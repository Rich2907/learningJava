import java.util.*;
public class TakesInput{
    public static void main(){
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("Input:");
            String input=sc.next().toLowerCase();
            if(input.equals("quit"))
                break;
            else 
            System.out.println("Pass");
        }

    }
}