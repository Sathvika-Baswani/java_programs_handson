import java.util.Arrays;
import java.util.Scanner;

public class AverageofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];

        
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int number : numbers) {
                sum =sum + number;
        }
        System.out.println("sum of numbers in the array:"+sum);
        float avg = sum / size;
        System.out.println("Average of numbers in the array:"+avg);
        sc.close();
    }
}
