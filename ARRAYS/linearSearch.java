import java.util.*;
public class linearSearch{

    public static int lSearch(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int a[]=new int[5];
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers :-");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("enter key to find  :-");
        key=sc.nextInt();


        //func call

       int index= lSearch(a,key);
       if(index==-1){
        System.out.println("key not found ");
       }
       else{
        System.out.println("key found at index : "+index);
       }
       
            // time complexity =O(n)

    }
}