import java.util.Arrays;
import java.util.Scanner;

public class RepeatedCharA {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();    
        int count = 0;     
        char string[] = string1.toCharArray();     
        for(int i = 0; i <string.length; i++) {          
            if(string[i] == 'a' && string[i] != ' ') {    
                count++;          
            }    
        } 
        System.out.println("Number of times a repeated is:"+ count); 

        
    }        
}
