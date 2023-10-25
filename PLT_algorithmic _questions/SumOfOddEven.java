import java.util.Scanner;

public class SumOfOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        
        int[] numbers = new int[size];

        
        System.out.println("Enter elements for the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int sumodd = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sumodd =sumodd + number;
            }
        }
        System.out.println("sum of Odd numbers in the array:"+sumodd);

        int sumeven = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sumeven = sumeven + number;
            }
        }
        System.out.println("sum of Odd numbers in the array:"+sumeven);
        sc.close();
    }
}
