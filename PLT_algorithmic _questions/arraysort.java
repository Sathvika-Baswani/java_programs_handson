import java.util.Arrays;

public class arraysort {
    public static void main(String args[]){
        int arr1[] = {2,3,14,7};
        int arr2[] = {45,23,5,6,70};
        int arr1L = arr1.length;
        int arr2L = arr2.length;
        int arr3L = arr1L + arr2L;
        int arr3[] = new int[arr3L];
        System.arraycopy(arr1, 0, arr3, 0, arr1L);
        System.arraycopy(arr2, 0, arr3, arr1L, arr2L);
        System.out.println(Arrays.toString(arr3));
        for(int i=0;i<arr3L;i++){
            for(int j=i+1;j<arr3L;j++){
                if(arr3[i]>arr3[j]){
                    int temp=arr3[i];
                    arr3[i]=arr3[j];
                    arr3[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
}
