public class LongestCommonSubSeq {
    // using Recursion 
    public static int lcs(String str1,String str2,int n,int m ){
        // base case 
        if(n==0 || m==0) return 0;

        if(str1.charAt(n-1)==str2.charAt(m-1)){
           return  1+lcs(str1, str2, n-1, m-1);
        }
        else{
            int choice1=lcs(str1, str2, n, m-1);
            int choice2=lcs(str1, str2, n-1, m);
            return Math.max(choice1, choice2);

        }

    }
    // using Memoization :- Advanced Recursion

    public static int lcs2(String str1,String str2,int n,int m,int dp[][]){
        // base case
        if(n==0 || m==0) return 0;

        if(dp[n][m]!=-1){
            return dp[n][m];
        }
        else{
            if(str1.charAt(n-1)==str2.charAt(m-1)){
               dp[n][m]= 1+lcs2(str1, str2, n-1, m-1, dp);
               return dp[n][m];
            }
            else{
                // two choices 
                int choice1=lcs2(str1, str2, n, m-1, dp);
                int choice2=lcs2(str1, str2, n-1, m, dp);
                dp[n][m]=Math.max(choice1, choice2);
                return dp[n][m];
            }
        }


    }

    public static int lcsTab(String s1,String s2){
        int n=s1.length();
        int m=s2.length();

        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        // for(int i=0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++){
        //         System.out.print(dp[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();

        return dp[n][m];

    }

    public static void main(String[] args) {
        String str1="abcde";
        String str2="ace";
        int n=str1.length();
        int m=str2.length();
        System.out.println(lcs(str1, str2, n, m));

        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(lcs2(str1, str2, n, m, dp));
        System.out.println(lcsTab(str1, str2));

    }
    
}
