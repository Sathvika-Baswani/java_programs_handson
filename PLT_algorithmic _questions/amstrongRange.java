import java.util.Scanner;

public class amstrongRange {
    public static void main(String[] args) {

        int low, high;
        Scanner sc = new Scanner(System.in);
        low = sc.nextInt();
        high = sc.nextInt();
        for(int num = low ; num < high; num++) {
          int digits = 0;
          int sum = 0;
          int n = num;
          while (n != 0) {
            n /= 10;
            ++digits;
          }
    
          n = num;
          while (n != 0){
            int rem = n % 10;
            sum += Math.pow(rem, digits);
            n /= 10;

          }
        if(sum==num){
            System.out.println(num);
        }
            
        }

    }
  

}
