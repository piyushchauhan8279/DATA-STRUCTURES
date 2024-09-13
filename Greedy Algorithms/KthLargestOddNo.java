public class KthLargestOddNo {
    public static void main(String[] args) {
        int L=-3;
        int R=3;
        int k=5;
        int X;
        int ans;
        if(R%2==1){
            X=R;

        }
        else{
            X=R-1;

        }

        ans=X-((k-1)*2);
        

        if(ans<L){
            System.out.println(0);
        }
        else{
            System.out.println(ans);
        }

    }
    
}
