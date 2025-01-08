import java.util.Arrays;

public class Catalan {
    // using recursion 

    public static int Catalian(int n){
        // base case
        if(n==0 || n==1) return 1;

        // c2-> c0.c1 + c1.c0

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Catalian(i)*Catalian(n-i-1);
        }
        return ans;

    }

    // recursion + memoization 

    public static int CatalanMem(int n,int[] dp){
        // base case 
        if(n==0 || n==1) return 1;

        if(dp[n]!=-1) return dp[n];

        int ans=0;
        for(int i=0;i<n;i++){
            ans+=CatalanMem(i, dp)*CatalanMem(n-i-1, dp);

        }
        return dp[n]=ans;

    }

    // using tabulation 
    public static int CatalanTab(int n){
        int dp[]=new int[n+1];
        // initialization 
        dp[0]=dp[1]=1;

        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-j-1];
            }
        }
        return dp[n];


    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(Catalian(n));
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(CatalanMem(n,dp));

        System.out.println(CatalanTab(n));



    }
    
}
