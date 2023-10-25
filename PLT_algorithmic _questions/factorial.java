import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(facto(n));
    }
    static int facto(int n){
        if(n == 0){
            return 1;
        }
        return n*facto(n-1);
    }
}
