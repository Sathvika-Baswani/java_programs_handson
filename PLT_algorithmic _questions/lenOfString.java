import java.util.Scanner;

public class lenOfString {
    public static void main(String[] args) {
		int length=0;
        Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
        for (char c1 : s.toCharArray()) 
			length++;
		System.out.println("Length of String is : "+length);
		
	}
}
