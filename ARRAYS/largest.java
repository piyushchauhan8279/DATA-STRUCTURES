import java.util.*;
public class largest{
    public static void getNumber(int a[],int largest,int smallest){
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
            }
              if(smallest>a[i]){
                smallest=a[i];
            }
           

        }
         
        System.out.println("largest no. is : "+largest);
        System.out.println("smallest no. is : "+smallest);

    }
    public static void main(String args[]){
        int a[]={10,15,20,25,30};
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        getNumber(a,largest,smallest);

        // time complexity = O(n)
    }
}