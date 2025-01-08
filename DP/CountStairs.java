// import java.util.*;

public class CountStairs {
    // using memoization 
    public static int countWays(int n,int[] ways){
        if(n==0) return 1;
        if(n<0) return 0;
        if(ways[n]!=-1) return ways[n];
        ways[n]= countWays(n-1,ways)+countWays(n-2,ways);
        return ways[n];

    }

    // using tabulation 

    public static int waysTab(int n,int ways[]){
        ways[0]=1;
        // for 3 steps      
        for(int i=1;i<=n;i++){
            if(i==1){
                ways[i]=ways[i-1];
            }
            else if(i==2){
                ways[i]=ways[i-1]+ways[i-2];

            }
            else{
                ways[i]=ways[i-1]+ways[i-2]+ways[i-3];

            }
           
        }
        return ways[n];


    }
    public static void main(String[] args) {
        int n=5;
        int dp[]=new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(countWays(n,dp));
        System.out.println(waysTab(n, dp));
    }
    
}
