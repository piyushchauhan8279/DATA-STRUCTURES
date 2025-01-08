public class StringConversion {
    public static int lcs(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    int ans1=dp[i][j-1];
                    int ans2=dp[i-1][j];
                    dp[i][j]=Math.max(ans1, ans2);
                }
            }
        }
        return dp[n][m];

    }
    public static int numOfOperation(String s1,String s2){
        int lcs=lcs(s1,s2);
        System.out.println("Longest Common Subsequence length:"+lcs);
        int n=s1.length();
        int m=s2.length();

        // total operation:-
        int x=lcs-n;
        int add=Math.abs(x);
        System.out.println("No. of add Operation:"+add);
        int y=lcs-m;
        int diff=Math.abs(y);
        System.out.println("No. of Delete Operation:"+diff);


        return add+diff;

    }
    public static void main(String[] args) {
        String s1="xyxyx";
        String s2="pqpqp";
        System.out.println("Total No. of Operation:"+numOfOperation(s1,s2));

    }
    
}
