public class DecToBin {
    public static void decimaltobinary(int n){
        int rem=0;

        int bin_no=0;
        int pow=0;
        while(n>0){
            rem=n%2;
            bin_no=bin_no+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.print(bin_no+" ");
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            decimaltobinary(i);
        }
        
    }
    
}
