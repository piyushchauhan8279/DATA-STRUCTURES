public class UnboundedKnapsack {
    public static int maxProfit(int v[],int w[],int dp[][]){

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                // int V=v[i-1];
                // int W=w[i-1];

                if(w[i-1]<=j){
                    // valid 

                    // include

                    int incProfit=v[i-1]+dp[i][j-w[i-1]];

                    // exclude
                    int excProfit=dp[i-1][j];

                    dp[i][j]=Math.max(incProfit, excProfit);
                }
                else{
                    // invalid 

                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];


    }
    public static void main(String[] args) {
        int v[]={15,14,10,45,30};
        int w[]={2,5,1,3,4};
        int W=7;
        int dp[][]=new int[v.length+1][W+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                if(!(j==0|| i==0)) dp[i][j]=-1;         
            }
        }

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");         
            }
            System.out.println();
        }

        System.out.println(maxProfit(v, w, dp));


        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");         
            }
            System.out.println();
        }




    }
    
    
}

