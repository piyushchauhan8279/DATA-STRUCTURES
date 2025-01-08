public class EditDistance {
    public static int countOperation(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        // initialization 
        for(int i=0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                dp[i][0]=i;
                dp[0][j]=j;
            }
        }

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                // same 
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }
                else{
                    //diff 
                    int add=dp[i][j-1];
                    int del=dp[i-1][j];
                    int rep=dp[i-1][j-1];
                    dp[i][j]=Math.min(del, Math.min(add, rep))+1;
                }
            }
        }
        print(dp);
        return dp[n][m];
        


    }
    // funcn to print the dp array 
    public static void print(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String word1="abc";
        String word2="sbc";
        System.out.println(countOperation(word1, word2));

    }
    
}
