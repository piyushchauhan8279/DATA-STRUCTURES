import java.util.*;
public class trappingRainWater{
    public static void trappedWater(int height[]){
        int trapWater=0;
        int n=height.length;
        int waterLevel;
        // Auxiliary arrays:-
        int maxLeft[]=new int[n];
        maxLeft[0]=height[0];
        for(int i=1;i<n;i++){
            maxLeft[i]=Math.max(height[i],maxLeft[i-1]);
        }
        int maxRight[]=new int[n];
         maxRight[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRight[i]=Math.max(height[i],maxRight[i+1]);
        }
        for(int i=0;i<height.length;i++){
            waterLevel=Math.min(maxRight[i],maxLeft[i]);
            trapWater+=(waterLevel-height[i]);
        }
        System.out.println("total trapped water is :"+trapWater);
    }
    public static void main(String args[]){
        int height[]={1,2,3,4,5};
        trappedWater(height);
    }

    // time cmplexity = O(n)
}