public class NotRepeated {
    public static void main(String[] args) {    
        int num[]= {1,2,3,3,8,1};    
        int count;        
            
        System.out.println("Non repeated nums: ");       
        for(int i = 0; i <num.length; i++) {    
            count = 1;    
            for(int j = i+1; j <num.length; j++) {    
                if(num[i] == num[j]) {    
                    count++;
                    num[j] = 0;      
        
                }    
            }    
            if(count > 1 && num[i]!=0)    
                System.out.println(num[i]+" "+count);    
        }
    }        

}
