public class CountingTrees {
    // using tabulation 
    // counting trees is a variation of catalan No.

    public static int countBst(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            // c2=c0*c1+c1*c0
            for(int j=0;j<i;j++){
                // dp[i]+=dp[j]*dp[i-j-1];
                int left=dp[j];
                int right=dp[i-j-1];
                dp[i]+=left*right;
            }
        }
        return dp[n];


    }
    public static void main(String[] args) {
        int n=3;// n=nodes 
        System.out.println("No. of BST Form: "+countBst(n));

    }
    
}
