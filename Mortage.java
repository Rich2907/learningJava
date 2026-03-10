import java.text.NumberFormat;
import java.util.*;
public class Mortage {
public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Principal:"); 
    double Principal;   
    while(true)
    {
        Principal=sc.nextDouble();
        if(Principal<1000 || Principal>1000000)
        {
            System.out.println("Enter a number between 1000 and 1000000");
        System.out.println("Principal: ");
        }
            else
        break;
    }

    System.out.println("Rate");
    double r;
     while(true)
    {
        r=sc.nextDouble();
        if(r<0 || r>30)
        {
            System.out.println("Enter rate that is between 0 and 30");
        System.out.println("Rate: ");
        }
            else
        break;
    }
    r=r/100/12;
    System.out.println("Period");
    double year;
    
     while(true)
    {
        year=sc.nextDouble();
        if(year<0 || r>30)
        {
            System.out.println("Enter a time period that is between 0 and 30");
        System.out.println("Period: ");
        }
            else
        break;
    }
    year=year*12;
    double mortage;
    double k=Math.pow(1+r,year);
    mortage=Principal*((r*k)/(k-1));
    Locale india = new Locale("en", "IN");
    String formatedMortage=NumberFormat.getCurrencyInstance(india).format(mortage);
 System.out.println(formatedMortage);
}
}