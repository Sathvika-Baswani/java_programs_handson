import java.util.Scanner;

public class program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();

        double result = calculatePower(base, exponent);
        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }

    public static double calculatePower(double base, int exponent) {
        double result = 1.0;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        return result;
    }
}
