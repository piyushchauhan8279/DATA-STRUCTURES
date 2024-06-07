import java.util.*;
public class kadanes{
    public static void kadanesAlgo(int a[]){
        int curr=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            curr+=a[i];
            if(curr<0){
                curr=0;
            }
            maxSum=Math.max(curr,maxSum);
        }
        
        System.out.println(maxSum);
    }
    public static void main(String args[]){
        int a[]={-2,-3,4,-1,-2,1,5,-3};
        kadanesAlgo(a);
    }
}