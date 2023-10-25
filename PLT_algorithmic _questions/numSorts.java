import java.util.Arrays;
import java.util.Scanner;

public class numSorts {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :");
    int s = sc.nextInt();
    char[] c = String.valueOf(s).toCharArray(); 
    Arrays.sort(c);
    System.out.println(c);
  }
}
