
import java.util.Scanner;
public class subMarks {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int firstsub =sc.nextInt();
        int secsub =sc.nextInt();
        int thirdsub =sc.nextInt();
        if(firstsub > 60 && secsub > 60 && thirdsub>60){
            System.out.println("Passed");

        }
        else if((firstsub > 60 && secsub > 60)||(thirdsub > 60 && secsub > 60 )||(firstsub > 60 && thirdsub > 60)){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Failed");
        }
    }
}
