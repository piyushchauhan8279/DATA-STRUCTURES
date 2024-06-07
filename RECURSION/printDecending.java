public class printDecending {
    public static void decending(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        decending(n-1);
        
    }
    public static void main(String args[]){
        // int n=10;
        decending(10);
    }
}
