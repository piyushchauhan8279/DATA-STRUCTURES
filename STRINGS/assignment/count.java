import java.util.*;
public class count{
    public static int countLowerCaseVowel(String str){
        int count=0;
        char a[]={'a','e','i','o','u'};
        for(int i=0;i<str.length();i++){
            for(int j=0;j<a.length;j++){
                if(str.charAt(i) == a[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(countLowerCaseVowel(str));
    }
}
