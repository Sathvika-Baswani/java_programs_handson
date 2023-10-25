
import java.util.Scanner;

public class program6 {
    public static void main(String args[]){
        String username = "abc";
        String password = "abc@123";
        Scanner sc = new Scanner(System.in);
        
        int login = 0;
        while(login<=3){
            System.out.println("Enter username and password:");
            String us = sc.nextLine();
            String pass=sc.nextLine();
            if(username.equals(us) && password.equals(pass)){
                System.out.println("Welcome"+username);
                break;
            }
            login++;
            if(login==3){
                    System.out.println("Contact admin");
                }
        
        }
        
    }
}
