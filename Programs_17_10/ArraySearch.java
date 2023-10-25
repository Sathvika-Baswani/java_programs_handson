
import java.util.Scanner;

public class ArraySearch {
    public static void main(String args[]){
        int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== n){
                f=1;
            }
        }
        if(f==0){
            System.out.println("The number is not present in array ");
        }
        else{
            System.out.println("The number is present in array ");
        }
        
    }
}
