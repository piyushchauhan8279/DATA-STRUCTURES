public class assignmentQues4{
    public static void trappedRainWater(int height[]){
        int n=height.length;
        int maxLeftBoundary[]=new int[n];
        maxLeftBoundary[0]=height[0];
        for(int i=1;i<n;i++){
            maxLeftBoundary[i]=Math.max(maxLeftBoundary[i],height[i-1]);
        }
        int maxRightBoundary[]=new int[n];
        maxRightBoundary[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            maxRightBoundary[i]=Math.max(maxRightBoundary[i],height[i+1]);
        }

        int waterLevel;
        int trappedWater=0;
        for(int i=0;i<n;i++){
            waterLevel=Math.min(maxLeftBoundary[i],maxRightBoundary[i]);
            trappedWater+=waterLevel-height[i];
        }
        System.out.println(trappedWater);
        
    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedRainWater(height);
    }
}