public class Fibonacci{
    // memoization 
    public static int fib(int n,int[] dp){
        if(n==0||n==1) return n;
        if(dp[n]!=0) return dp[n];

        dp[n]= fib(n-1,dp)+fib(n-2,dp);
        return dp[n];
    }

    // tabulation 

    public static int fibTab(int n){
        int dp[]=new int[n+1];
        if(n==0 || n==1) return n;
        else{
            
            dp[1]=1;

        }     
        for(int i=2;i<dp.length;i++){
            
            dp[i]=dp[i-1]+dp[i-2];
            
        }
        return dp[n];      

    }

    public static void main(String[] args) { 
        for(int i=0;i<11;i++){
            int f[]=new int[i+1];
            System.out.print(fib(i,f)+" ");
            
        }
        System.out.println();

        for(int i=0;i<11;i++){
            System.out.print(fibTab(i)+" ");
        }
             
             
    }
}