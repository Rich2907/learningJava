import java.text.NumberFormat;
import java.util.*;
public class Mortage {
public static void main(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Principal:");
    double Principal=sc.nextDouble();
    System.out.println("Rate");
    double r=sc.nextDouble();
    r=r/100/12;
    System.out.println("Period");
    double year=sc.nextDouble();
    year=year*12;
    double mortage;
    double k=Math.pow(1+r,year);
    mortage=Principal*((r*k)/(k-1));
    Locale india = new Locale("en", "IN");
    String formatedMortage=NumberFormat.getCurrencyInstance(india).format(mortage);
 System.out.println(formatedMortage);
}
}