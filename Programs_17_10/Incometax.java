
import java.util.Scanner;

public class Incometax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=0 && num<=180000){
            System.out.println("no tax");
        }
        else if(num>=181001 && num<=300000){
            int amount = num*10/100;
            System.out.println(amount);
        }
        else if(num>=300001 && num<=500000){
            int amount = num*20/100;
            System.out.println(amount);
        }
        else if(num>=500001 && num<=1000000){
            int amount = num*30/100;
            System.out.println(amount);
        }
        else{
            System.out.println("Give number between 0 to 1000000");
        }
    }
}
