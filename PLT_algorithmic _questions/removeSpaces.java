import java.util.Scanner;

public class removeSpaces {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.replace(" ","");
        System.out.println(str1);
    }
}
