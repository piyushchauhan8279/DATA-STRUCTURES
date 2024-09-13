import java.util.Arrays;
public class Minimum_abs {
    public static void main(String[] args) {
        int A[]={1,2,3,9};
        int B[]={2,1,3,8};
        Arrays.sort(A);
        Arrays.sort(B);
        int MinDiff=0;
        for(int i=0;i<A.length;i++){
            MinDiff+=Math.abs(A[i]-B[i]);

        }
        System.out.println("Minimum Difference is :"+MinDiff);
    }
    
}
