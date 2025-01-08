public class MountainsValley {
    public static int mountainRanges(int n){
        // using tabulation
        // moutain ranges is also a variation of catalan's number
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            // Cn-> C0*Cn-1+C1*Cn-2- - - - - 
            for(int j=0;j<i;j++){
                int inside=dp[j];
                int outside=dp[i-j-1];
                // dp[i]+=dp[j]*dp[i-j-1];

                dp[i]+=inside*outside;
            }
        }
        return dp[n];

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(mountainRanges(n));

    }
    
}
