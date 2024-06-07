import java.util.Arrays;
public class anagrams{
    public static boolean  printAnagramsOrNot(String str1,String str2){
        
        if(str1.length()==str2.length()){
            char arr1[]=new char[str1.length()];
            char arr2[]=new char[str2.length()];

            for(int i=0;i<str1.length();i++){
                arr1[i]=str1.charAt(i);
            }
            for(int i=0;i<str2.length();i++){
                arr2[i]=str2.charAt(i);
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1,arr2);
    }
     else{
            System.out.println("Strings are  not anagrams of each others");

        }
        return false;
    }
    public static void main(String args[]){
        String str1="caraaaemmp";
        String str2="raaaampcem";
        System.out.println(printAnagramsOrNot(str1,str2));
    }
}