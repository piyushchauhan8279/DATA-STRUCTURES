
import java.util.*;
public class LonelyNum {
    public static  ArrayList<Integer>  FindLonelyNum(ArrayList<Integer> nums){
        ArrayList<Integer> lonelyNum=new ArrayList<>();

        for(int i=0;i<nums.size();i++){
            if(i!=nums.size()-1 &&(nums.get(i)==nums.get(i+1) || nums.get(i+1)==nums.get(i)+1)){
                continue;
            }

            if(i!=0 &&(nums.get(i)==nums.get(i-1) || nums.get(i-1)==nums.get(i)-1)){
                continue;
            }
            lonelyNum.add(nums.get(i));

            

        }
        return lonelyNum;



       
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> nums=new ArrayList<>();
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size ");
        int n=sc.nextInt();
        System.out.println("enter elements ");
        for(int i=0;i<n;i++){
            int items=sc.nextInt();
            nums.add(items);
        }

        sc.close();
        Collections.sort(nums);
        System.out.println(nums);
        System.out.println( FindLonelyNum(nums));
    }    
}
