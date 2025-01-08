public class RodCutting {
    // using tabulation

    // variation of unbounded Knapsack 
    
    public static int maxVal(int price[],int[] length,int rodlength){
        int n=price.length;
        int[][] dp=new int[n+1][rodlength+1];
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<rodlength+1;j++){
                // valid
                if(length[i-1]<=j){
                    // include

                    int ans=price[i-1]+dp[i][j-length[i-1]];
                    int ans2=dp[i-1][j];
                    // exclude

                    dp[i][j]=Math.max(ans, ans2);
                }
                else{
                    // invalid 

                    // exclude

                    dp[i][j]=dp[i-1][j];

                }
            }

        }System.out.println();
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][rodlength];
    }
    public static void main(String[] args) {
        int rodlength=8;
        int[] length={1,2,3,4,5,6,7,8};
        int[] price={1,5,8,9,10,17,17,20};

        System.out.println(maxVal(price, length, rodlength));


    }
    
}
