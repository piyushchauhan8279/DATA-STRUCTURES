import java.util.*;
public class binarySearch{
    public static int  bSearch(int a[],int key){
        int start=0;
        int end=a.length-1;
        while(start<=end){
        
        int mid;
        mid=(start+end)/2;

        if(a[mid]<key){
            start=mid+1;
        }
        else if(a[mid]>key){
            end=mid-1;
        }
        else{
            return mid;
        }
        }

        return -1;


    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9};
        int key=1;
       System.out.println (bSearch(a,key));
      


    }
}