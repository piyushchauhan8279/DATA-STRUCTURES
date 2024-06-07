import java.util.*;

public class printIncreasing {

    public static void increasing(int n){
        if(n==1){
            System.out.println(n+" ");
            // return;
        }
        increasing(n-1);
        System.out.println(n+" ");

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();

        increasing(n);

    }
    
}
