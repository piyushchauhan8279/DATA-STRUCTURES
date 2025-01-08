public class TargetSumSubset {

    // using tabulation 

    public static boolean targetSum(boolean[][] dp,int[] nums){
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int v=nums[i-1];
                if(v<=j && dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];


    }
    public static void main(String[] args) {
        int nums[]={4,2,7,1,3};
        int targetSum=10;
        int n=nums.length;
        // i> items and j> targetSum
        boolean dp[][]=new boolean[n+1][targetSum+1];
        
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
        System.out.println(targetSum(dp,nums));

        
        // print dp

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
