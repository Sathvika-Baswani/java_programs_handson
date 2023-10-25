
import java.util.Scanner;

public class simpleCompound {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter principle amount ");
        double p =sc.nextDouble();
        System.out.println("Enter time ");
        double t =sc.nextDouble();
        System.out.println("Enter rate");
        double r =sc.nextDouble();
        double si = (p*t*r)/100;
        double comp = p * Math.pow(1+r/100,t) - p;
        System.out.println("simple interest is" +si);
        System.out.println("compound interest is" +comp);

    }
    
}
