import java.util.Scanner;

public class fizzBuzz{

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Number:");
        int number=sc.nextInt();
        if(number%15==0)
            System.out.println("FizzBuzz");
        else if(number%3==0)
            System.out.println("Fizz");
        else if(number%5==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }

}