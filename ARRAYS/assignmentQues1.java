import java.util.*;
public class assignmentQues1{
    public static void repeatOrNot(int nums[]){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        if(count>0){
           System.out.println("true");
        }
        else{
           System.out.println("false");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :-");
        int size=sc.nextInt();
        int nums[]=new int[size];
        System.out.println("Enter  array elements :-");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        repeatOrNot(nums);
    }

}