
import java.util.*;
public class MaxWaterTwoPointer {
    public static int  maxWater(ArrayList<Integer> height){
        int leftPointer=0;
        int rightPointer=height.size()-1;
        int maxWater=0;
        while (leftPointer<rightPointer) {

            //currwater
            int ht=Math.min(height.get(leftPointer),height.get(rightPointer));
            int width=rightPointer-leftPointer;
            int currWater=ht*width;
            maxWater=Math.max(currWater,maxWater);

            //update pointers

            if(height.get(leftPointer)<height.get(rightPointer)){
                leftPointer++;
            }
            else{
                rightPointer--;
            }

            
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(maxWater(height));
    }
    
    
}