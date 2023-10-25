import java.util.Scanner;

public class perfectNumber {
    public static void main(String args[]){
        int num,i,sum=1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(i=2;i<num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        if(num==sum && num!=1){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }

    }
    
}
