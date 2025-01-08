import java.util.TreeSet;
public class LongestIncreasingSubSequence {

    public static int lcs(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;

        int dp[][]=new int[n+1][m+1];

        // here i skipped initialization 

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        // print the dp :- 2d array

        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[n][m];
    }

    public static int lis(int arr1[]){
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int arr2[]=new int[set.size()];
        int k=0;
        for(int i:set){
            arr2[k]=i;
            k++;
        }
        return lcs(arr1,arr2);
        

    }
    public static void main(String[] args) {
        int arr[]={50,3,10,7,40,80};
        System.out.println(lis(arr));

    }
    
}
