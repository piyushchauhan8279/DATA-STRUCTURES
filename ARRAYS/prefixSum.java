import java.util.*;
public class prefixSum{
    public static void prefixArray(int a[]){
        int[] prefix=new int[a.length];
        prefix[0]=a[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+a[i];
        }
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;


        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                currSum= i==0 ?prefix[j]:prefix[j]-prefix[i-1];
                 if(maxSum<currSum){
                maxSum=currSum;
            }
            }
           
        }
        System.out.println("maximum sum is "+maxSum);
    }
    public static void main(String args[]){
        int[] a={-2,-3,4,-1,-2,1,5,-3};
        prefixArray(a);
    }
}