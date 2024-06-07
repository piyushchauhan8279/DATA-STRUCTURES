// class reverse{
//     public static void main(String args[]){
//         int a[]={1,2,3,4,5};
//          System.out.print("reverse array is :");
//         for(int i=a.length-1;i>=0;i--){
//            System.out.println(+a[i] + " ");
//         }
    // }        
    
                  // T.C=O(n), S.C=O(n)

// }



import java.util.*;
public class reverse{

    public static void reverse(int a[]){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp;
            temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            start++;
            end--;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size=5;
        int a[]=new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        reverse(a);
    }
}