
import java.util.Scanner;

public class amstrongRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();
        for(int num=first;num<=last;num++){
            int n =num;
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum=sum+rem*rem*rem;
                n/=10;
            }
            if(sum==num){
                System.out.print(num+" ");
            }
        }
    }
}
