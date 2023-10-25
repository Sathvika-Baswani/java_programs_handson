import java.util.Scanner;

public class program11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string with characters to remove: ");
        String str2 = scanner.nextLine();

        String result = str1.replaceAll("["+str2+"]", "");

        System.out.println("Resulting String : " + result);

        scanner.close();
    }
}
