
import java.util.Scanner;

public class amstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum=0;
        int n = num;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem*rem;
            n/=10;
        }
        if(sum==num){
            System.out.println(num+" is amstrong");
        }
        else{
            System.out.println(num+" is not amstrong");
        }
    }
}
