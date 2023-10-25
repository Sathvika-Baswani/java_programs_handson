import java.util.Scanner;

public class strongNumber {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int temp,n;
        int sum =0;
        temp = num;
        while(temp!=0){
            n= temp%10;
            sum = sum + facto(n);
            temp/=10;

        }
        if (num == sum){
            System.out.println("It is a Strong Number");
        }
        else{
            System.out.println("Not a strong Number");
        }
    }
    static int facto(int num){
        if(num==0){
            return 1;
        }
        return num*facto(num-1);
    }

}
