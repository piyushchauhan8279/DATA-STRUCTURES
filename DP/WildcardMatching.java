public class WildcardMatching {
    public static boolean isMatch(String text,String Pattern){
        int n=text.length();
        int m=Pattern.length();
        boolean dp[][]=new boolean[n+1][m+1];

        // initialize

        dp[0][0]=true;

        for(int i=1;i<n+1;i++){
            dp[i][0]=false;
        }
        for(int j=1;j<m+1;j++){
            if(Pattern.charAt(j-1)=='*'){
                dp[0][j]=dp[0][j-1];
            }

            
        }

        // fill from small to large 

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(Pattern.charAt(j-1)==text.charAt(i-1) || Pattern.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }
                else if(Pattern.charAt(j-1)=='*'){
                    // include or exclude 

                    dp[i][j]=dp[i][j-1]||dp[i-1][j];

                }
                else{
                    dp[i][j]=false;
                }
            }
        }

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        return dp[n][m];

    }
    public static void main(String[] args) {
        String text="abcde";
        String pattern="*b**?a";
        System.out.println(isMatch(text, pattern));

    }
    
}
