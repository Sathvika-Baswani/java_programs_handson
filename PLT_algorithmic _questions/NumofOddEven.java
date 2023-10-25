public class NumofOddEven {
    public static void main(String[] args) {

        int numbers[] = new int[]{55,321,45,98,8,11,9,39,500};
        int oddCount=0,evenCount=0;
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("odd count :"+oddCount);
        System.out.println("even count :"+evenCount);
    }
}
