import java.util.Arrays;

public class mergeArrays {
    public static void main(String args[])
    {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9};
        int arr1L = arr1.length;
        int arr2L =arr2.length;
        int arr3L = arr1L + arr2L;
        int[] arr3 =new int[arr3L];
        System.arraycopy(arr1, 0, arr3, 0, arr1L);
        System.arraycopy(arr2, 0, arr3, arr1L, arr2L);
        System.out.println(Arrays.toString(arr3));
    }
}
