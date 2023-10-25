import java.util.Scanner;

public class StrToInt {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);

        String s=sc.nextLine();   
        int i=Integer.valueOf(s);  
        System.out.println(i); 
    }
}
