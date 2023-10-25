

public class StringOperations {
    public static void main(String args[]){
        String str ="Java String pool refers to collection of Strings which are stored in heap memory";

        String strL = str.toLowerCase();
        System.out.println("String changed to lowercase: "+str);

        String strU = str.toUpperCase();
        System.out.println("String changed to lowercase: "+strU);

        String strRep = str.replace('a','$');
        System.out.println("In String a changed to $: "+strRep);

        String strw ="collection";
        if( str.contains(strw)){
            System.out.println(strw + " word is present in String ");
        }
        else{
            System.out.println("Word is not present in string");
        }

        String str1= "java string pool refers to collection of strings which are stored in heap memory";
        System.out.println(str.equals(str1));
        System.out.println(str.compareTo(str1));
        /*if(str.equals(str1)){
            System.out.println("Strings equal");
        }
        else{
            if(str.compareTo(str1)){
                System.out.println("Strings equal");
            }
        }*/
        

    }
}
