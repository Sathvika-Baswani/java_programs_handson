import java.util.Arrays;
import java.util.Scanner;

public class Palindromestr {
    public static void main(String args[]){
        int arr[] = {2,3,43,1,34,43,1,2,3,6};
        int temp;
        int size = arr.length;
        for(int i= 0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i= 0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
}
}
