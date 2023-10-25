import java.util.Scanner;

public class nEqualParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the number of equal parts (n): ");
        int n = scanner.nextInt();

        int partLength = input.length() / n;

        System.out.println("Divided into " + n + " equal parts:");
        for (int i = 0; i < n; i++) {
            int start = i * partLength;
            int end = (i + 1) * partLength;
            System.out.println(input.substring(start, end));
        }

        scanner.close();
    }
}
