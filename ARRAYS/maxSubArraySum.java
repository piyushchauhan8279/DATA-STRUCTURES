import java.util.*;
public class maxSubArraySum{
    
    public static void subArraySum(int a[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
              
            for(int j=i;j<a.length;j++){
              currSum=0;
                for(int k=i;k<=j;k++){
                    currSum=currSum+a[k];
                }
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.print(currSum);
                System.out.println();
            }
        }
        System.out.println("maximum sum is : "+ maxSum);
    }
    public  static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        subArraySum(a);
    }
}