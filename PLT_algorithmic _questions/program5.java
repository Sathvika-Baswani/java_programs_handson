import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        Set<Character> uniqueChars = new HashSet<>();
        for (char c : input.toCharArray()) uniqueChars.add(c);

        System.out.println("Unique characters in the string: " + uniqueChars);

        scanner.close();
    }
}
