public class tilingProblem {
    public static int countWays(int n){
        if(n==0 || n==1){
            return 1;
        }
        // vertical tiles:
        int fnm1=countWays(n-1);

        //horizontal tiles:
        int fnm2=countWays(n-2);

        // total ways:-
        int fn=fnm1+fnm2;

        return fn;
    }
    public static void main(String[] args) {
        System.out.println(countWays(2));
    }
}
