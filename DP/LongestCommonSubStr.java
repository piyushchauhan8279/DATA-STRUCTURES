public class LongestCommonSubStr {
    // using tabulation

    public static int lcsubStr(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=0;

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    ans=Math.max(ans,dp[i][j]);
                }
            }
        }

        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return ans;
        

    }
    public static void main(String[] args) {
        String s1="ABCDE";
        String s2="ABGDF";
        System.out.println(lcsubStr(s1, s2));

    }
    
}
