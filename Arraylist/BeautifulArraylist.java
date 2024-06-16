import java.util.*;
public class BeautifulArraylist {
    public static  ArrayList<Integer> checkArrayList(ArrayList<Integer> nums,int n){
        
        nums.add(1);
        while(nums.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();

            //odd 
            for(int i=0;i<nums.size();i++){
                if(nums.get(i)*2-1<=n){
                    temp.add(nums.get(i)*2-1);
                }
            }
            // even 
            for(int i=0;i<nums.size();i++){
                if(nums.get(i)*2<=n){
                    temp.add(nums.get(i)*2);
                }
            }
            nums=temp;
        }
        return nums;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size ");
        int n=sc.nextInt();
        ArrayList<Integer> nums=new ArrayList<>();
        System.out.println(checkArrayList(nums,n));
    }
    
}
