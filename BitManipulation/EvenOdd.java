public class EvenOdd{
    public static void isEvenOrOdd(int n){
        int bitMask=1;

        if((n & bitMask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        int n=191;
        isEvenOrOdd(n);
    }
}