import java.util.Arrays;

public class array {
    public static void main(String args[]){
        int arr[] = {2,3,3,4,5,6,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
            if(arr[i]!=0){
            System.out.println(arr[i]);
        }

        }
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for(int i:arr){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
        
        
    }
}
